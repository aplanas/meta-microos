SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python310-u-msgpack-python-2.7.2-2.2.noarch.rpm"
RPM_HASH = "7615f2abdf1feba95994c861b6ef3aa2a6c8cbf94624bb11968cdc809eee1597aa5ec0d3a5f926cd91c21fec7741806c53b408beadcdff578fd2069d33dfe498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-u-msgpack-python \
python310-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm

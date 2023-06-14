SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python310-u-msgpack-python-2.7.2-2.1.noarch.rpm"
RPM_HASH = "5b28ad59b79eeccc69a47ea3982ea1f1c6074c918ff725561e422d5b208345a1815cc2eda7b6c82f50d57923ad80fec745300b84e57e3364da5e27ba2ecf9002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-u-msgpack-python \
python3.10dist-u-msgpack-python \
python310-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm

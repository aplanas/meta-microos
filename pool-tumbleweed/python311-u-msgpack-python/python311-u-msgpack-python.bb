SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python311-u-msgpack-python-2.7.2-2.2.noarch.rpm"
RPM_HASH = "7fd4429f988b9cae9116d0ce3938f1fa798cd8a54873fe03a7161abb47404dcb419a3e17aa3a2ba473fab335083524707b8ad04677d862f9b66f7242fb5bd812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-u-msgpack-python \
python3.11dist-u-msgpack-python \
python311-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm

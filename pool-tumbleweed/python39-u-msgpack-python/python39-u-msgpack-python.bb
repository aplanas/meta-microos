SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python39-u-msgpack-python-2.7.2-2.1.noarch.rpm"
RPM_HASH = "deee1de0166a351cac8d9bfc6fa2b948447358bf27c23d8148f80432e9b87a7243deabb734233d493b2c2b802c907e2abb5379d1e93830c4c9eaeec4bd9ffa36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(u-msgpack-python) \
python39-u-msgpack-python \
python3dist(u-msgpack-python)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

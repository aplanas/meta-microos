SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python311-u-msgpack-python-2.7.2-2.1.noarch.rpm"
RPM_HASH = "85396fa0a3ca1a16dc12be7d49b34d97e610ce53525cd6355ae7b26fd398a59004888864e2c39a214f16a7c46b5833108d4bda136c8e4829c881d7d597adbc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-u-msgpack-python \
python311-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm

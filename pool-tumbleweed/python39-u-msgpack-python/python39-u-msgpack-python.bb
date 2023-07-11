SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.7.2"

RPM_NAME = "python39-u-msgpack-python-2.7.2-2.2.noarch.rpm"
RPM_HASH = "f8cdaab6295f4339802445e8dd441f95144c6c705d55c3c26bd6dd22151c87405c839fdc3142aa687b3aa1c8363701656575f8df70465a519b0b9c4c2947197c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-u-msgpack-python \
python39-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm

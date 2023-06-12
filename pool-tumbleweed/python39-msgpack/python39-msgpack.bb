SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python39-msgpack-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "6b72319a2ea8629769c5baca185f5c79401a4ca730d6e62bd7c14349ae24b53da287b5a71107064e7b4bbe340a09698986a6e462f12be6c87cd3670f9c783315"

RPROVIDES:${PN} += "python3.9dist(msgpack) \
python39-msgpack \
python39-msgpack(aarch-64) \
python39-msgpack-python \
python3dist(msgpack)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

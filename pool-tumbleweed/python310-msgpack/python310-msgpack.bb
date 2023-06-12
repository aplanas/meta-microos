SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python310-msgpack-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "25629857a375da811473d1b38d8cc32356882a10d2648035b8a37bcd99e37f5878ccbf5df35bf8c76f08d3bd8484941033a6168fe45cd1809fc301053b92e169"

RPROVIDES:${PN} += "python3-msgpack \
python3-msgpack-python \
python3.10dist(msgpack) \
python310-msgpack \
python310-msgpack(aarch-64) \
python310-msgpack-python \
python3dist(msgpack)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

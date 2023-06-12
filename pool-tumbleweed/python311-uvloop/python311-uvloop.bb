SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python311-uvloop-0.17.0-1.5.aarch64.rpm"
RPM_HASH = "0c1bd9d6f028cc58f982663229e729230c442cc6d61b751a9ae183d31635604b93f577cdf27358f81dd103ba7abae54b8f4794d95682712befb6e45654db9078"

RPROVIDES:${PN} += "python3.11dist(uvloop) \
python311-uvloop \
python311-uvloop(aarch-64) \
python3dist(uvloop)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libuv.so.1()(64bit) \
python(abi)"

inherit rpm

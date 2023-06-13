SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python310-uvloop-0.17.0-1.5.aarch64.rpm"
RPM_HASH = "dbb61141b9a876b0f9348463642d9754cd90100122d5398fba0a3944435ffa8fb2f04458983e1f578255ae3922b54c36e46741748332caf4f82e6ae5fccdc8ae"

RPROVIDES:${PN} += "python3-uvloop \
python3.10dist(uvloop) \
python310-uvloop \
python310-uvloop(aarch-64) \
python3dist(uvloop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libuv.so.1()(64bit) \
python(abi)"

inherit rpm

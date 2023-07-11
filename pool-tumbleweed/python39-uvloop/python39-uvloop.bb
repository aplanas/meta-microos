SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python39-uvloop-0.17.0-2.1.aarch64.rpm"
RPM_HASH = "d525354f88c54ad932a9f380a1b0abd4fe36e1b898c7616a5a2a16e2b67d3d046559a8bd516a81acf424ec34e2cc7a8ee2b46a6cc86b4a5d8c6889e8dc1aef6d"

RPROVIDES:${PN} += "python3.9dist-uvloop \
python39-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

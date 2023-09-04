SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python311-uvloop-0.17.0-3.1.aarch64.rpm"
RPM_HASH = "62bb14d8ba7815556818a9503eb81eb80f59ec920bdc43062c745e82019bfead292a3bef6bb9ec12dbc728533f04412b78e79641239a8137d85f3d49b01d2de7"

RPROVIDES:${PN} += "python3-uvloop \
python3.11dist-uvloop \
python311-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

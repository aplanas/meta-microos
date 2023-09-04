SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python310-uvloop-0.17.0-3.1.aarch64.rpm"
RPM_HASH = "402978085b7a8c2e9e2457427943f1d2c43ca92a07b7f4b3e6304479ffed46ea78fb4bb3095d51084d784ff5569e13e9ef962d8e011013e5b0a21ce4994baed2"

RPROVIDES:${PN} += "python3.10dist-uvloop \
python310-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

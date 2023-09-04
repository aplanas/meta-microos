SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python39-uvloop-0.17.0-3.1.aarch64.rpm"
RPM_HASH = "817cc384a94ab13fc3b54ee95313e2140903f0560f248b64d6f7b4a43be932a1730e7c2c9f4d08eb62a2afa544b7290335f14c37e8462bd964c4666eb5abc8d4"

RPROVIDES:${PN} += "python3.9dist-uvloop \
python39-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

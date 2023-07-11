SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python311-uvloop-0.17.0-2.1.aarch64.rpm"
RPM_HASH = "bc29d93c5e8cb1e059de678f8c7eb7fdcb3b60851de36032ac98af7040ff5399d4341229bc54d38bd900dfdbdb0c0e52769c355f94cba9bd7af1ce05100fbaf2"

RPROVIDES:${PN} += "python3-uvloop \
python3.11dist-uvloop \
python311-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

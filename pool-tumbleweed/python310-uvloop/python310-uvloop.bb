SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python310-uvloop-0.17.0-2.1.aarch64.rpm"
RPM_HASH = "1eaf8873f5b30e205d067cbb2a96a1d8d911617747394a3aa2591770c500297ad6a9eb086768874a916014e17b710657541f6039658d2a1b671ada8c6740e203"

RPROVIDES:${PN} += "python3.10dist-uvloop \
python310-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm

SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python39-miniupnpc-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "f6b71ec622a5afd3765054de8563ba3c6775f31f1b4a069d6d3ff11e3d1475cd6fb08b302388c728dcca3f7ac80338cd8dae66b42df4b19c32f8060c1de0f9e3"

RPROVIDES:${PN} += "python3.9dist-miniupnpc \
python39-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm

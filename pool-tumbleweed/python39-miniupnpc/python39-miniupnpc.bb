SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python39-miniupnpc-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "a592f683a8bf4035cc75cfee4e14267ef3b68a7b1c5171c74b920b05553c02d3cfb8ee02e2b8ed8737ae38daf1f3d0a7ee64353a0d5a2ce32d570012f88de5fd"

RPROVIDES:${PN} += "python3.9dist-miniupnpc \
python39-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm

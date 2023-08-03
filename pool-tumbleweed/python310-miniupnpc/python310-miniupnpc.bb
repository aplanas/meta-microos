SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python310-miniupnpc-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "70dcb7da311053f045f6f989313cc200847feed8085f5564334431cba50516b831fce12a17a01ea80e195811a24ee87db326edf5db63da088e0abcb6a03a802d"

RPROVIDES:${PN} += "python3.10dist-miniupnpc \
python310-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm

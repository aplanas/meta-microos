SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python311-miniupnpc-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "47f013ce4e887ceb30a06081125561b15e24f47f3696bec861bde3788c8bbcba9277cd143cd55ea1ba420952bf61685f2ffe746ea50121deb9a80b7343e996ea"

RPROVIDES:${PN} += "python3-miniupnpc \
python3.11dist-miniupnpc \
python311-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm

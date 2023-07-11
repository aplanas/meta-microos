SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python311-miniupnpc-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "245a06fd2c407b2c6b47e9ef6cabeef8b7bac6f1d079e4d6aa0917e2c3a7016a8a93be2bd94d6d2425e54bd5dd345a50adddd90227cb0cb91b60e8608e3f48f3"

RPROVIDES:${PN} += "python3-miniupnpc \
python3.11dist-miniupnpc \
python311-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm

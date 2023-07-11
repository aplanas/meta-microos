SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer library."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "libKOSMIndoorMap1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8d4099b391eea03f7bcde160f86543202a3020c47ff1ff0d0f29fdf3e66cdd083127b212bd28b25824c36cdab99941c001684c70e5876977e8566fc516594753"

RPROVIDES:${PN} += "libKOSMIndoorMap.so.1 \
libKOSMIndoorMap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKOSM.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Shared object for Qt5 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying x11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-in-qt5-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "51efef98855a91400707efdd363bd3ed54f070130b82493bdba2134b2c6f875f1759ce9b35a967c07ba578e865c308afc549e70be9ae45b7a158c50161422a05"

RPROVIDES:${PN} += "libsuil-x11-in-qt5.so \
suil-plugin-x11-in-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm

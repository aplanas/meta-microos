SUMMARY = "Hex Editor KParts plugin"
DESCRIPTION = "Hex editing component for KParts"
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "okteta-part-0.26.13-1.1.aarch64.rpm"
RPM_HASH = "7bc268b4a8253c2bd6119a9f3c3e8aa0258a35865da2adb378cc26cdfcc65ae19365630370a447e56a022c3ce810cc00e86f03847332dce8dfdebe83884a9e4b"

RPROVIDES:${PN} += "okteta-part"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Gui.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

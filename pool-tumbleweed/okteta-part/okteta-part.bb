SUMMARY = "Hex Editor KParts plugin"
DESCRIPTION = "Hex editing component for KParts"
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-part-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "9a0184d0fae1cbaa71b076d7d0510dc22303f4527ad566e5f3a91dcb72378cc89a4586e3a35dd03118238d0064a38d9d148e7175e2ea34ce7fc638d35d61c863"

RPROVIDES:${PN} += "okteta-part \
okteta-part(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKasten4Controllers.so.0()(64bit) \
libKasten4Core.so.0()(64bit) \
libKasten4Gui.so.0()(64bit) \
libKasten4Okteta2Controllers.so.0()(64bit) \
libKasten4Okteta2Core.so.0()(64bit) \
libKasten4Okteta2Gui.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

SUMMARY = "Hex Editor KParts plugin"
DESCRIPTION = "Hex editing component for KParts"
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-part-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "9a0184d0fae1cbaa71b076d7d0510dc22303f4527ad566e5f3a91dcb72378cc89a4586e3a35dd03118238d0064a38d9d148e7175e2ea34ce7fc638d35d61c863"

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

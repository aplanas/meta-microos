SUMMARY = "Adwaita Qt5 theme"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt5-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "8b53a23088335dd0c902a8305f4635a8fe49602d9c9172fcf1438307c6196ce0e8c009c753378ace75636b3389926041e8c4f66f018f2d161929b4dd985190c7"

RPROVIDES:${PN} += "adwaita-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libadwaitaqt.so.1 \
libadwaitaqt5-1 \
libadwaitaqtpriv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm

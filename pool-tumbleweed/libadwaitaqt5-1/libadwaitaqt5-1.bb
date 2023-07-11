SUMMARY = "Adwaita Qt5 library"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt5-1-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "b6121fb899649fb35b7fab9cdaf386ed46f9a19991cd07d3023ed3ede2c8047a41eebed065016eb1b3b0e813a05ae3c044b1068c84dcc452981c196de2be7685"

RPROVIDES:${PN} += "libadwaitaqt.so.1 \
libadwaitaqt1 \
libadwaitaqt5-1 \
libadwaitaqtpriv.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

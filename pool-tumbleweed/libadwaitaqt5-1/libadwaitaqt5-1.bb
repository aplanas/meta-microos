SUMMARY = "Adwaita Qt5 library"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt5-1-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "bef585d20a1a1b984a9124626e4fd7d0e6620c8e3aee26d20cfd5effc6ae71e0a086eb4263b602f87df0c08448556fafb0a1a17824f16958292cb1194c3a8ec4"

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

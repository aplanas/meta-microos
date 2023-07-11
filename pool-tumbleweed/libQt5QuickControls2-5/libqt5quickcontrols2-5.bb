SUMMARY = "Qt 5 QuickControl2 Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde6"

RPM_NAME = "libQt5QuickControls2-5-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "881430a4a34f0698216d33c621d179f8efda2c87cd6f898fa7b5fca451aaf42470f7bf0c9e7a614209c4a53a3872d9e31df09e629867f21abe5d035f799b3be2"

RPROVIDES:${PN} += "libQt5QuickControls2-5 \
libQt5QuickControls2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTemplates2.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

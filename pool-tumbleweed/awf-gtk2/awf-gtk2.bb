SUMMARY = "Theme preview application for GTK 2"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 2 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "awf-gtk2-2.6.0-1.9.aarch64.rpm"
RPM_HASH = "2843a0ee3cb0827ab8314a1912f42fa12fe1520ba0714cce408e0a16a8ee040f13a20fa4dbd55e979065e2e14c2d2f216ba3d877df0a5297afb17c40cd5de1de"

RPROVIDES:${PN} += "application() \
application(awf-gtk2.desktop) \
awf-gtk2 \
awf-gtk2(aarch-64)"

RDEPENDS:${PN} += "gtk2 \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm

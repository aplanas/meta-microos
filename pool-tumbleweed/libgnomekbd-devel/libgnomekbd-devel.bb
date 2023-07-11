SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd-devel-3.28.1-1.4.aarch64.rpm"
RPM_HASH = "a2e2b2844f1f315765963f60a32dd5995cf0b7c846bf11e5463f4cb89f65bbf0f8e93a43d4053a9d5fa011ac82643d9cdab2b1cc98284f855ac7a96f8f37f976"

RPROVIDES:${PN} += "libgnomekbd-devel \
pkgconfig-libgnomekbd \
pkgconfig-libgnomekbdui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnomekbd-tools \
libgnomekbd8 \
pkgconfig-gdk-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgnomekbd \
pkgconfig-libxklavier \
pkgconfig-x11 \
typelib-1-0-Gkbd-3-0"

inherit rpm

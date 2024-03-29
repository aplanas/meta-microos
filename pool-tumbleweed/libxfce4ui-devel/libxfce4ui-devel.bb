SUMMARY = "Development Files for the libxfce4ui Library"
DESCRIPTION = "This package provides development files for developing applications based on \
the libxfce4ui library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-devel-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "e1c862e7c6b543a849ce2f41efd1b51c98afbd177919ac6751d6c29acbdb9686f8c61c12e81df377f382f71f2bf84062a53ef94d925f45fcc481b7c776ee990f"

RPROVIDES:${PN} += "libxfce4ui-devel \
libxfce4uiglade2.so \
pkgconfig-libxfce4kbd-private-3 \
pkgconfig-libxfce4ui-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4kbd-private-3-0 \
libxfce4ui-2-0 \
libxfce4ui-2.so.0 \
pkgconfig-gdk-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
pkgconfig-libxfconf-0"

inherit rpm

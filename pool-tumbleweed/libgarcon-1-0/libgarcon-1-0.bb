SUMMARY = "Library Implementing the freedesktop.org Desktop Menu Specification"
DESCRIPTION = "Garcon is a library based on GLib and GIO which implements the freedesktop.org \
Desktop Menu Specification. It is the sucessor to libxfce4menu and covers \
almost every part of the menu specification except for legacy menus and a few \
XML attributes. It is capable of loading menus modified with menu editors such \
as Alacarte and also supports merging."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-1-0-4.18.1-2.1.aarch64.rpm"
RPM_HASH = "439b11131fd009ace2ba9574d71c7929393eff2f7d51369e0763b78e4c87c31c8212b04ca92ea49304f15ad7fb843cbd1410b883e31643796416e4d43fd3f1c6"

RPROVIDES:${PN} += "libgarcon-1-0 \
libgarcon-1-0(aarch-64) \
libgarcon-1.so.0()(64bit) \
libgarcon-gtk3-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgarcon-data \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm

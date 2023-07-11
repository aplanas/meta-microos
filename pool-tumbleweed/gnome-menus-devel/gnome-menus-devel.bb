SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-devel-3.36.0-3.4.aarch64.rpm"
RPM_HASH = "64a97609fc67cb47f613305143826cef3585baba09bb9a82745709b8569b3b4bb7414ae959503d739762e8a5bad04d7ac4429faeff39179bdf76c8ec6015a953"

RPROVIDES:${PN} += "gnome-menus-devel \
pkgconfig-libgnome-menu-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-menu-3-0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-GMenu-3-0"

inherit rpm

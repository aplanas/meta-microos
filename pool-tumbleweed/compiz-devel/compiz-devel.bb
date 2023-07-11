SUMMARY = "Development files for Compiz"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-devel-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "37c4fe131536e62af64078e17a4e810146e3aa2d8c7d0e7a8bdfd4a69d2ca4d82ecaa5f5607aa794c3b718bf53b6a53604b8f2d2b6a6a3a75dc6d888c5d6988b"

RPROVIDES:${PN} += "compiz-devel \
pkgconfig-compiz \
pkgconfig-compiz-cube \
pkgconfig-compiz-scale \
pkgconfig-libdecoration"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins \
libjpeg-devel \
libxslt-tools \
pkgconfig \
pkgconfig-cairo \
pkgconfig-cairo-xlib-xrender \
pkgconfig-compiz \
pkgconfig-fuse \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0 \
pkgconfig-ice \
pkgconfig-libpng \
pkgconfig-librsvg-2.0 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-libwnck-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xcursor \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xrandr \
pkgconfig-xrender"

inherit rpm

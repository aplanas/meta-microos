SUMMARY = "Development files for Weston plugins"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. \
 \
This package contains all necessary include files and libraries needed \
to develop plugins for Weston."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "weston-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "6324e468862ddcb1f6b3008e1d78c87acc84b4d5caba72e35b6c7381f066c15f270307f3ea6268a658fc257c23917832c1c17e3246ad705b131c8f5eb979eb82"

RPROVIDES:${PN} += "pkgconfig-libweston-12 \
pkgconfig-libweston-12-protocols \
pkgconfig-weston \
weston-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libweston-12-0 \
pkgconfig-libweston-12 \
pkgconfig-pixman-1 \
pkgconfig-wayland-server \
pkgconfig-xkbcommon"

inherit rpm

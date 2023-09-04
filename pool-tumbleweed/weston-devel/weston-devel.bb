SUMMARY = "Development files for Weston plugins"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. \
 \
This package contains all necessary include files and libraries needed \
to develop plugins for Weston."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.2"

RPM_NAME = "weston-devel-12.0.2-1.1.aarch64.rpm"
RPM_HASH = "c31494d48ec479585db7c61916a56d3efe2fc33ca2d47c6f1c378747bd3a061518f8afb4c090ba321788522393e02789f0f73196b46fa32d21a9e54e5b5cfdac"

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

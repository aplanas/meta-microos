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

RPM_NAME = "weston-devel-12.0.1-1.2.aarch64.rpm"
RPM_HASH = "6daf7c6271d2409975a84e0db70e34fa1cad37808f81fdc164d5153c9041fdeb42edd0b3ed78e9a75609803790325f26badb87116a44d83ee4feda7763aa64d6"

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

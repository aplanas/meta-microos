SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk4-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk4-devel-0.6-1.8.aarch64.rpm"
RPM_HASH = "bf37cf2b0867e24aab487a9a13be1ebbd49cb21faab79c4fcd36d681ed5168b45a7945d267a7e8b3ab5572d6001036cfbc75f3148c937e451b68b961ddd9783d"

RPROVIDES:${PN} += "libportal-gtk4-devel \
pkgconfig-libportal-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk4-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-libportal \
typelib-1-0-XdpGtk4-1-0"

inherit rpm

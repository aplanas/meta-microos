SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-devel-0.7-1.1.aarch64.rpm"
RPM_HASH = "a672c5c75883f611c94f09f6f915181d56da3042800b5db0c7a306948073cffa9295a03fcecd2ad55ab9ad61594ee088ff32305c8560cb53c3d3d15538203107"

RPROVIDES:${PN} += "libportal-devel \
pkgconfig-libportal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-Xdp-1-0"

inherit rpm

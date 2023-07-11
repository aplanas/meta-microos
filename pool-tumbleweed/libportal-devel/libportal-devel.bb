SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-devel-0.6-1.8.aarch64.rpm"
RPM_HASH = "05a5c9db241bd5e8d6d37f830398281f7b2c41071db282345570afa94e5218e98937e6023a556fff89f1ddbaf4f254e380841f753d9ecff060e704fc890c1916"

RPROVIDES:${PN} += "libportal-devel \
pkgconfig-libportal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-Xdp-1-0"

inherit rpm

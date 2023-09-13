SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk3-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-gtk3-devel-0.7-1.1.aarch64.rpm"
RPM_HASH = "2461bc98e5f0b959299d28c3ad895ab6932e88f117280df1dd52534c1fb6b58efa1d770e830e6c14e4fb3f18fe35c2da070e0a81c705dd92f547742a54a4df58"

RPROVIDES:${PN} += "libportal-gtk3-devel \
pkgconfig-libportal-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk3-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libportal \
typelib-1-0-XdpGtk3-1-0"

inherit rpm

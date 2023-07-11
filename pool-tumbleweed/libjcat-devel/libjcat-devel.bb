SUMMARY = "Development package for libjcat"
DESCRIPTION = "Files for development with libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.14"

RPM_NAME = "libjcat-devel-0.1.14-1.1.aarch64.rpm"
RPM_HASH = "1668942e850d851a434b8d2d4d1056a9d37ce3804c41388b660a41c2a120720ebbc8da6052ec74313236a5732281ed1ecc80ab33a171a21ecd983c8a0a85df93"

RPROVIDES:${PN} += "libjcat-devel \
pkgconfig-jcat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
jcat-tool \
libjcat1 \
pkgconfig-gio-2.0 \
pkgconfig-gnutls \
pkgconfig-hogweed \
pkgconfig-json-glib-1.0"

inherit rpm

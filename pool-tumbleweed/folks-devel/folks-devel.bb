SUMMARY = "Development files for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-devel-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "7d606e1b72dd6a50251a2aa66b6b37a46714e324a57a26194f35f79eaef59af1bb8a62455a9e04e15b53c503db3c661d43302c9be96104c6cdd898ab1e792a67"

RPROVIDES:${PN} += "folks-devel \
pkgconfig-folks \
pkgconfig-folks-dummy \
pkgconfig-folks-eds \
pkgconfig-folks-telepathy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfolks-eds26 \
libfolks-telepathy26 \
libfolks26 \
pkgconfig-folks \
pkgconfig-gee-0.8 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libebook-1.2 \
pkgconfig-libedataserver-1.2 \
pkgconfig-telepathy-glib \
typelib-1-0-Folks-0-7 \
typelib-1-0-FolksEds-0-7 \
typelib-1-0-FolksTelepathy-0-7"

inherit rpm

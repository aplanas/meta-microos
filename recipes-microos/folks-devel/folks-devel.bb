SUMMARY = "Development files for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-devel-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "2b5c07e6d26397772829504797d0c102d4d769858ca89be8082b2f0fc324214afc5212a567d6826f0cfe0c5ded61cf3470fb9eaeede5d2185b106fee304c8941"

RPROVIDES:${PN} += "folks-devel \
folks-devel(aarch-64) \
pkgconfig(folks) \
pkgconfig(folks-dummy) \
pkgconfig(folks-eds) \
pkgconfig(folks-telepathy)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfolks-eds26 \
libfolks-telepathy26 \
libfolks26 \
pkgconfig(folks) \
pkgconfig(gee-0.8) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libebook-1.2) \
pkgconfig(libedataserver-1.2) \
pkgconfig(telepathy-glib) \
typelib-1_0-Folks-0_7 \
typelib-1_0-FolksEds-0_7 \
typelib-1_0-FolksTelepathy-0_7"

inherit rpm

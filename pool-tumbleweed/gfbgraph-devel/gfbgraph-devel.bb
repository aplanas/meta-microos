SUMMARY = "Development files for the Facebook Graph API access library"
DESCRIPTION = "A GObject library for Facebook Graph API \
 \
This package contains header and linker information."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "gfbgraph-devel-0.2.5-1.8.aarch64.rpm"
RPM_HASH = "9b4fd4a6fd956f827e9eab9f3fae58e3c40b56249dc7b5b8044a9a020af3b793896d24b5008e3f14486a6f0a98c2c657914506cf67a915dc470b168b9224550d"

RPROVIDES:${PN} += "gfbgraph-devel \
gfbgraph-devel(aarch-64) \
pkgconfig(libgfbgraph-0.2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgfbgraph-0_2-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(goa-1.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(libsoup-2.4) \
pkgconfig(rest-0.7) \
typelib-1_0-GFBGraph-0_2"

inherit rpm

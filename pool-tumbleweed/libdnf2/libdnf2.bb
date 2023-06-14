SUMMARY = "Library providing an interface atop libsolv"
DESCRIPTION = "This library provides an interface atop libsolv, and a high-level \
RPM package manager library interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf2-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "7babf859486d4b0589e6746919c65ad79134252a6550d10bf8ec769da15d492c808f3e24b65b169374a1e2d4b5d57316d858c74e4e18ac80830c025f08fa03f6"

RPROVIDES:${PN} += "libdnf.so.2 \
libdnf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libjson-c.so.5 \
liblzma.so.5 \
libmodulemd.so.2 \
libmodulemd2 \
librepo.so.0 \
librepo0 \
librpm.so.9 \
librpmio.so.9 \
libsmartcols.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm

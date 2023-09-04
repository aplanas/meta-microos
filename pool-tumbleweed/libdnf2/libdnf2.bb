SUMMARY = "Library providing an interface atop libsolv"
DESCRIPTION = "This library provides an interface atop libsolv, and a high-level \
RPM package manager library interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "libdnf2-0.70.2-1.1.aarch64.rpm"
RPM_HASH = "071c5850e21609f93c62a3a4488de16833ad34bb599c81b92c004550d6ef6a3f4c2bd84cf3999331d75f25415446b1688310a493191a8942cf8a706b7a15b095"

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

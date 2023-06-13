SUMMARY = "Library providing an interface atop libsolv"
DESCRIPTION = "This library provides an interface atop libsolv, and a high-level \
RPM package manager library interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf2-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "7babf859486d4b0589e6746919c65ad79134252a6550d10bf8ec769da15d492c808f3e24b65b169374a1e2d4b5d57316d858c74e4e18ac80830c025f08fa03f6"

RPROVIDES:${PN} += "libdnf.so.2()(64bit) \
libdnf2 \
libdnf2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libjson-c.so.5()(64bit) \
liblzma.so.5()(64bit) \
libmodulemd.so.2()(64bit) \
libmodulemd2(aarch-64) \
librepo.so.0()(64bit) \
librepo0(aarch-64) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libsmartcols.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm

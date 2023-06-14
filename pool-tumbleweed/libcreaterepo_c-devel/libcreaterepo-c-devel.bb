SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "This package contains the createrepo_c C library and header files. \
These development files are for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c-devel-0.20.1-3.1.aarch64.rpm"
RPM_HASH = "da47ccfbbbd5e112ee8b06c379b683d0d5b65fb98f737a074a8c71966fc82f36199c15d09e29c719fffdc81bdd32ef9710a9010dd4db3339be10f1aec7db4747"

RPROVIDES:${PN} += "createrepo-c-devel \
libcreaterepo-c-devel \
pkgconfig-createrepo-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcreaterepo-c0 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0 \
pkgconfig-rpm \
pkgconfig-sqlite3 \
pkgconfig-zlib"

inherit rpm

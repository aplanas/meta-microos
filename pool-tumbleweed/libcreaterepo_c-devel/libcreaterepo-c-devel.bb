SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "This package contains the createrepo_c C library and header files. \
These development files are for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c-devel-0.20.1-3.2.aarch64.rpm"
RPM_HASH = "5c57193424847caac09e28ca354fa53b1dcd7190a387702b9cb064f735872278e0bac9a138464ca8ff00000cb5e98c7f7f87394a2a3adb355528f179869b1f33"

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

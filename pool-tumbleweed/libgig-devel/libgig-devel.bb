SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig-devel-4.3.0-1.9.aarch64.rpm"
RPM_HASH = "a96675588fb58d2e8dff7fb2f76fac11941c72eb41def089c416348f48af49c0591efbabefaaf7d195fa7966c8451b5a7e19979cf50546e6adee4f0cb363fb02"

RPROVIDES:${PN} += "libgig-devel \
pkgconfig-akai \
pkgconfig-gig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgig10"

inherit rpm

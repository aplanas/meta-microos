SUMMARY = "Development files for libass, a subtitle rendering library"
DESCRIPTION = "This package is needed if you want to develop / compile against libass."
LICENSE = "ISC"

PV = "0.17.1"

RPM_NAME = "libass-devel-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "da41ca1995fbf459870cc0fa4d382150be1bffd6a5d669d5bedebc28118106b2e31b632b4c5c3d76e4ee4701bd70dea7da4b31719e524dda7546154a32e7675f"

RPROVIDES:${PN} += "libass-devel \
pkgconfig-libass"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libass9 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-harfbuzz"

inherit rpm

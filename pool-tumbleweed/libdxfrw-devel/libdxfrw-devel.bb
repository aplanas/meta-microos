SUMMARY = "Development files for libdxfrw"
DESCRIPTION = "This package includes development files for libdxfrw."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0+git.20221210"

RPM_NAME = "libdxfrw-devel-2.2.0+git.20221210-1.1.aarch64.rpm"
RPM_HASH = "332e9fdcf3ad6ddcc1229268ef3140990226321c2960e888a7c246cb3634af1bad47c3c971def8483373fe3517e608ddf50c9e2cc02794b7fb72b6b8f0d82cec"

RPROVIDES:${PN} += "cmake-libdxfrw \
libdxfrw-devel \
pkgconfig-libdxfrw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdxfrw1"

inherit rpm

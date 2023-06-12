SUMMARY = "Development files for Botan"
DESCRIPTION = "This package contains the header files and libraries needed to develop \
programs that use the Botan library."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "libbotan-devel-2.19.3-1.4.aarch64.rpm"
RPM_HASH = "7cb704a093fdc009e926e512e512e0f50446ff954306279703f83f92350a413528147d671b75c94b1a9c61040e013f18abc97429bd4b766b893b75bb9e9f4dd3"

RPROVIDES:${PN} += "Botan-devel \
libbotan-devel \
libbotan-devel(aarch-64) \
pkgconfig(botan-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbotan-2-19 \
libbz2-devel \
pkgconfig(liblzma) \
pkgconfig(sqlite3) \
trousers-devel"

inherit rpm

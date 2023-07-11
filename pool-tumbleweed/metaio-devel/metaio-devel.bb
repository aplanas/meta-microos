SUMMARY = "Development files for libmetaio"
DESCRIPTION = "This package contains the sources and header files needed for developing applications using libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-devel-8.5.1-1.9.aarch64.rpm"
RPM_HASH = "f6e790a7384a569311f614944ed006fc72eee3c4ef39ecacf605673f690a921d4d0b8f456c94263fa250f6e4c88986616a6cc17c9b07d258a3baecde048e33d6"

RPROVIDES:${PN} += "metaio-devel \
pkgconfig-libmetaio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetaio1 \
pkgconfig-zlib"

inherit rpm

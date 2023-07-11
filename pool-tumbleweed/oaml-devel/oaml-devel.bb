SUMMARY = "Development files for OAML, the Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the development files for oaml."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oaml-devel-1.3.4-1.15.aarch64.rpm"
RPM_HASH = "759f0810a837d7b27503d61018b7e9c5fca8962ad716741270860b76e71b5939c2872efd8056430050390a3d3afc095288ae90a27ec19a7186c7caa5e91a191c"

RPROVIDES:${PN} += "oaml-devel \
pkgconfig-oaml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboaml1 \
pkgconfig-ogg \
pkgconfig-vorbis"

inherit rpm

SUMMARY = "Header files, libraries and development documentation for libqalculate"
DESCRIPTION = "This package contains the header files and development \
documentation for libqalculate. If you like to develop programs using libqalculate, \
you will need to install libqalculate-devel."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "libqalculate-devel-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "1a0429e9e09d26816276e698d051252eda433ac802f596b4800e0ac871ded445772249f9f17f621a9e4379db370712b22476cf7a1797257034f51a618ce6ac5e"

RPROVIDES:${PN} += "libqalculate-devel \
pkgconfig-libqalculate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libqalculate \
pkgconfig-libxml-2.0 \
pkgconfig-mpfr"

inherit rpm

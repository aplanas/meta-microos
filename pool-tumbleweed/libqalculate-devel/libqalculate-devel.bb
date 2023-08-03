SUMMARY = "Header files, libraries and development documentation for libqalculate"
DESCRIPTION = "This package contains the header files and development \
documentation for libqalculate. If you like to develop programs using libqalculate, \
you will need to install libqalculate-devel."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "libqalculate-devel-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "b8c9d71cb24cc7ae6addebc864eb8f8e822c2cd0c5f998145eebc10f558e802188a889a2dd1d370a87fed3b61693fc65681c6433e9e7292e188c80b2e112eea6"

RPROVIDES:${PN} += "libqalculate-devel \
pkgconfig-libqalculate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libqalculate \
pkgconfig-libxml-2.0 \
pkgconfig-mpfr"

inherit rpm

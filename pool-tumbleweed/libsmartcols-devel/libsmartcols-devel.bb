SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-2.39-1.1.aarch64.rpm"
RPM_HASH = "89f0168ce9b4048552e6df3e6f720537ba6a5d7410afbab0a390ea8b0cae12bfa0909be3d8ec0c5063d286577cea4c786f77fb7cfbd14d1d81fb3c9b4f4b421b"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm

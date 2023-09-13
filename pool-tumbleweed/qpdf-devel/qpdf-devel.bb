SUMMARY = "Development files for qpdf PDF manipulation library"
DESCRIPTION = "The qpdf-devel package contains header files and libraries necessary \
for developing programs using the qpdf library."
LICENSE = "Apache-2.0"

PV = "11.6.0"

RPM_NAME = "qpdf-devel-11.6.0-1.1.aarch64.rpm"
RPM_HASH = "3473943164e1f99e2a70d2eb03474976912ad7beb7de19559d382244908375f4e88eb452c597dbf5b92924beccb13fc3fe354f27271f8d3ecf31bcb14ea1ae54"

RPROVIDES:${PN} += "cmake-qpdf \
pkgconfig-libqpdf \
qpdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqpdf29 \
libstdc++-devel \
pkgconfig-gnutls \
pkgconfig-libjpeg \
pkgconfig-zlib \
qpdf"

inherit rpm

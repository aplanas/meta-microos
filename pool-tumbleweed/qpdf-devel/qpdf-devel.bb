SUMMARY = "Development files for qpdf PDF manipulation library"
DESCRIPTION = "The qpdf-devel package contains header files and libraries necessary \
for developing programs using the qpdf library."
LICENSE = "Apache-2.0"

PV = "11.5.0"

RPM_NAME = "qpdf-devel-11.5.0-1.1.aarch64.rpm"
RPM_HASH = "31c404bc7eea83490a9c76fe6b9ecda41e2410c977809e449c256f8280e8f55aa87624eb9aa5f6a13dd9b7fa78e51f64734e4e55578747e2c36e48fe8e77ff7b"

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

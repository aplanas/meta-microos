SUMMARY = "Development files for qpdf PDF manipulation library"
DESCRIPTION = "The qpdf-devel package contains header files and libraries necessary \
for developing programs using the qpdf library."
LICENSE = "Apache-2.0"

PV = "11.4.0"

RPM_NAME = "qpdf-devel-11.4.0-1.1.aarch64.rpm"
RPM_HASH = "60b1b344c003fd26008072f8e5c3cd62d46680b9d5731f5674c49430814da73159bc47d225f28dfb515ad10f23d45c9cfb42230c841644b86d623b14f0b04dad"

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

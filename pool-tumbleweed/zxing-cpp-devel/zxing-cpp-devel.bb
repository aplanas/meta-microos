SUMMARY = "Header files for zxing, a library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides header files to use ZXing in \
other applications."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "zxing-cpp-devel-2.0.0-2.2.aarch64.rpm"
RPM_HASH = "856c50834a98ce748d85473d89a03b5abd0042a388863254635e39251f93c8d7de932bbcd84a132844ed5de08ba0df550cb5ff5f31c60b588b558ef3c64d5bcf"

RPROVIDES:${PN} += "cmake-ZXing \
pkgconfig-zxing \
zxing-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libZXing3"

inherit rpm

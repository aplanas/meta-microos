SUMMARY = "Header files for zxing, a library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides header files to use ZXing in \
other applications."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "zxing-cpp-devel-2.0.0-3.1.aarch64.rpm"
RPM_HASH = "3de05d33f147d8933e4a004701362d2767c18ea325913c69b3b2d3bb4636bc1bae96210f1f465ebe07c948f3ceac2e7d6703acb5fabdf9cc348985ffd2d13df7"

RPROVIDES:${PN} += "cmake-ZXing \
pkgconfig-zxing \
zxing-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libZXing3"

inherit rpm

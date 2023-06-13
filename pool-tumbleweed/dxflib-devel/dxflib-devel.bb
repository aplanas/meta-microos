SUMMARY = "Development files for dxflib, a DXF parsing library"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "dxflib-devel-3.26.4-2.8.aarch64.rpm"
RPM_HASH = "5a2ff4a4c66dc7c1906dc909bc9a2f69cc591f7bd215b5bc12ba3ac5b312357fba9318cd0b904d81707df044439e6ca92e44bedf7464538381e95a017542e5e1"

RPROVIDES:${PN} += "dxflib-devel \
dxflib-devel(aarch-64) \
pkgconfig(dxflib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdxflib-3_26_4-1"

inherit rpm

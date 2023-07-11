SUMMARY = "Development files for dxflib, a DXF parsing library"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "dxflib-devel-3.26.4-2.9.aarch64.rpm"
RPM_HASH = "b382a223df6bf8291a4f49275b4458ababd23490c4ce213aed925f120c3b0f27e18fd620872489199e993ec05d415e414d90cc5969ef63f1b3bd670bc0f04693"

RPROVIDES:${PN} += "dxflib-devel \
pkgconfig-dxflib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdxflib-3-26-4-1"

inherit rpm

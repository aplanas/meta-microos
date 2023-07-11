SUMMARY = "Development files for oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "This package contains the development headers and pkgconfig files for \
the oneAPI Video Processing Library (oneVPL) dispatcher"
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-devel-2023.2.0-1.2.aarch64.rpm"
RPM_HASH = "86ec7855e8443d3d50c3eb87a762ffdbc5721178cd4c79822497137da3ceda1fc72489ab003cff70a0f31fed764b7ba0f14f4640f7b54adad3570e29cf73b302"

RPROVIDES:${PN} += "cmake-VPL \
libvpl-devel \
pkgconfig-vpl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpl2"

inherit rpm

SUMMARY = "Development files for oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "This package contains the development headers and pkgconfig files for \
the oneAPI Video Processing Library (oneVPL) dispatcher"
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-devel-2023.2.0-1.1.aarch64.rpm"
RPM_HASH = "78b62ed4dfd537dcb6630e67ccd3ebef32bbe9edb152c27be45028564bc146aade218cf59c503d7f1b466fad42759107e6bf042892c3dddf20937ca6e0b5f6e7"

RPROVIDES:${PN} += "cmake(VPL) \
libvpl-devel \
libvpl-devel(aarch-64) \
pkgconfig(vpl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpl2"

inherit rpm

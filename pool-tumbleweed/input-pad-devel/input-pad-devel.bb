SUMMARY = "Development tools for input-pad"
DESCRIPTION = "The input-pad-devel package contains the header files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-devel-1.0.99.20140916-5.10.aarch64.rpm"
RPM_HASH = "b15c23246d71f988693abe33a1d1b7c4556041a12a272a56996f22280f91634238b105d21f56872172073c8ab78fedc86a7e62ebf73287720b0d4ff106e8e8f9"

RPROVIDES:${PN} += "input-pad-devel \
pkgconfig-input-pad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
input-pad \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm

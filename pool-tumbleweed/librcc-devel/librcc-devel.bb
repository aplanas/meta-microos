SUMMARY = "Development files for librcc, a charset conversion library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of librcc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc-devel-0.2.13-1.3.aarch64.rpm"
RPM_HASH = "47e5d9eca77d1d30bcdd82768adda8aea720b7375d1cb1ed9c2ae8b5b4f56f18ad453dbabb0e6d0e244388c6ba4319081c4cf3cf7785be5f1d223f9cec8b9678"

RPROVIDES:${PN} += "librcc-devel \
pkgconfig-librcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcc0 \
pkgconfig-libxml-2.0"

inherit rpm

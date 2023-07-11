SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-devel-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "ce4eba6a9f8b63f0d7b39ec46c511e2d85ab9c232a863a0c1cee74f986863bf91c8c65c6c2cf41d0b9966af55ddf91f11736141f1e74a565b30da8d61040256a"

RPROVIDES:${PN} += "libtolua++-5-3-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.3"

inherit rpm

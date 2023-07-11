SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-devel-1.0.93-10.4.aarch64.rpm"
RPM_HASH = "b441f77b6a07f723e72668a0b48e853f75391394b97983250b0ed21fb3153e0d0b1ca845c391150788161ad05dcd8923051ba6ef27da512f688239d047f6d194"

RPROVIDES:${PN} += "libtolua++-5-1-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.1"

inherit rpm

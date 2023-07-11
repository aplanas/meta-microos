SUMMARY = "Development files for libusrp"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libusrp."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "libusrp-devel-3.4.7-1.5.aarch64.rpm"
RPM_HASH = "e50c4742e9e91740f4b73014495918055073c4b220be59c5a510edde7eeb775a42da0c6878b4a956b84593ad560af124a3ca43f59a354a4874623f0eb680e598"

RPROVIDES:${PN} += "libusrp-devel \
pkgconfig-usrp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusrp1 \
pkgconfig-libusb-1.0"

inherit rpm

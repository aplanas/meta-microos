SUMMARY = "Development files for libusrp"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libusrp."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "libusrp-devel-3.4.7-1.4.aarch64.rpm"
RPM_HASH = "bc5361b21e6a30c8c456df440087d80616cfe82b42b1590ac3420bfb0a55378616fff26c7ff62ff2c07b42b29ab8489ae189ad2a2ec8d31bd43817d5d0bd72d9"

RPROVIDES:${PN} += "libusrp-devel \
libusrp-devel(aarch-64) \
pkgconfig(usrp)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusrp1 \
pkgconfig(libusb-1.0)"

inherit rpm

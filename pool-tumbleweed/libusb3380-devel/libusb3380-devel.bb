SUMMARY = "Development files for libusb3380"
DESCRIPTION = "USB3380 abstraction layer for libusb. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libusb3380."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190126"

RPM_NAME = "libusb3380-devel-0.0.0+git.20190126-2.6.aarch64.rpm"
RPM_HASH = "e1ec1d1a7ab8a5c0250e4dd039bdd622578c0eb8925074d653b2778cd8bb37a2c2c63e9cff14df0e4fd1f202be9da1f77d30203a795780493befc951fc751765"

RPROVIDES:${PN} += "libusb3380-devel \
libusb3380-devel(aarch-64) \
pkgconfig(libusb3380)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusb3380-0 \
pkgconfig(libusb) \
pkgconfig(libusb-1.0)"

inherit rpm

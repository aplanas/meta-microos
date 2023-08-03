SUMMARY = "Development libraries and header files for hidapi"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the hidapi library."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-devel-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "d579245d329662714937f27094d92195d2ff1a4953ae347b137c9e0e187d69620c6c99ccec1dc7a40c0f70af43ebc427db3f3ca3264466f17e0cfa7d840c51c6"

RPROVIDES:${PN} += "libhidapi-devel \
pkgconfig-hidapi-hidraw \
pkgconfig-hidapi-libusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libhidapi-hidraw0 \
libhidapi-libusb0 \
libudev-devel \
libusb-1-0-devel"

inherit rpm

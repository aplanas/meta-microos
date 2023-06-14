SUMMARY = "Development libraries and header files for hidapi"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the hidapi library."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-devel-0.13.1-1.2.aarch64.rpm"
RPM_HASH = "143cfd08aeffc832fc55032e66f915afa32bba0f186b60d0314f21e5991d3293c8282ab6f6410e79cd1d5d7e23ccd53a115954a7e52b2a1d2a34aeac79437bf5"

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

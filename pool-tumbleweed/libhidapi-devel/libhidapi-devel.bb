SUMMARY = "Development libraries and header files for hidapi"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the hidapi library."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-devel-0.13.1-1.3.aarch64.rpm"
RPM_HASH = "177367eb4e42a44690cd7561edb60eb3a7849bc41b595974c3d997cba6964fb44820d29bb44115c7f049e0df6e984fd55c875f1e03e49519edf1dc4900eb6d4e"

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

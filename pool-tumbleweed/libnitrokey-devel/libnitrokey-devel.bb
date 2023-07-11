SUMMARY = "Development files for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-devel-3.8-1.4.aarch64.rpm"
RPM_HASH = "108639c4e0a056705a334dc691babbe33090ee85cf8923770b6f1323ab78d3aa09743ed6b6d715d389c963e35b87124bc30abdf4ca93aade038ddc54a1145ecd"

RPROVIDES:${PN} += "libnitrokey-devel \
pkgconfig-libnitrokey-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnitrokey3 \
pkgconfig-hidapi-libusb"

inherit rpm

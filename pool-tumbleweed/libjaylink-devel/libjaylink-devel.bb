SUMMARY = "USB interface library for J-Link -- development files"
DESCRIPTION = "Library for accessing Segger J-Link USB devices. \
 \
This sub-package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-devel-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "63a2cd5c4a599612bd245d5d1b0a38f18d9517976dc1afca269d3a5fd1660c746303454c64bbf7a1f6d1549caf375fc595db4230762bf4feb0ec63321db5a6d9"

RPROVIDES:${PN} += "libjaylink-devel \
libjaylink-devel(aarch-64) \
pkgconfig(libjaylink)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjaylink0 \
pkgconfig(libusb-1.0)"

inherit rpm

SUMMARY = "Development files for wpebackend-fdo"
DESCRIPTION = "The wpebackend-fdo-devel package contains libraries, build data, and \
header files for developing applications that use wpebackend-fdo."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "wpebackend-fdo-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "035bcb6c0231ea2b4e231c5c0528558838f711d1b8ed0734fc63ee9c420d8a793dbc9642f855b815d2cd45f6f775b9aa627e9c76339916cbd527dfadb860becd"

RPROVIDES:${PN} += "pkgconfig(wpebackend-fdo-1.0) \
wpebackend-fdo-devel \
wpebackend-fdo-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEBackend-fdo-1_0-1 \
pkgconfig(wpe-1.0)"

inherit rpm

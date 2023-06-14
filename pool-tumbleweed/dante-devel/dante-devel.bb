SUMMARY = "Development files for the Dante SOCKSv4/v5 library"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. \
 \
This package contains the header files for Dante."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-devel-1.4.3-2.8.aarch64.rpm"
RPM_HASH = "9d64e1222ac3d98674a6cb660ca2813714fa9109d9680c9e6bc42d360c3f9dc579704564a361ab6698f2d3b2640067f021624d4c0b13a0789be76844bd36d794"

RPROVIDES:${PN} += "dante-devel \
dantedev"

RDEPENDS:${PN} += "libsocks0"

inherit rpm

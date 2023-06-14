SUMMARY = "Development files for libfwps"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwps."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "libfwps-devel-20230202-1.4.aarch64.rpm"
RPM_HASH = "f3b5bc3cdeed14ce2ab737fec0f3ce8919b70d1712f79fead2739c49300089b57b9b2a218d37c83298b4478e5007836496c343ca10ac78bada9eec96e1e764e7"

RPROVIDES:${PN} += "libfwps-devel \
pkgconfig-libfwps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwps1"

inherit rpm

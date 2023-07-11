SUMMARY = "Development files for the popt library"
DESCRIPTION = "The popt-devel package includes header files and libraries necessary \
for developing programs which use the popt C library. It contains the \
API documentation of the popt library, too."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-devel-1.19-1.4.aarch64.rpm"
RPM_HASH = "ea04e9e0b6843519cc4a6a1e8a26fe8c8c93f3cfc482eeb2a80e2292840e3fc361c7a815716cf862111616072ec39613fb5b0e3e856a2889d5ada4f20be53c33"

RPROVIDES:${PN} += "pkgconfig-popt \
popt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpopt0"

inherit rpm

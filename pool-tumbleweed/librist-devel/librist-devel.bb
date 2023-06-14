SUMMARY = "Development files for librist"
DESCRIPTION = "The librist-devel package contains libraries and header files for \
developing applications that use librist."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "librist-devel-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "c460c07af2127c97ce15241fd9309c3965448b900065088a9096f42a62f2e0815732d83594e6de668fecdf93672c05481c010de26e70519d9a87923b143811eb"

RPROVIDES:${PN} += "librist-devel \
pkgconfig-librist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librist4"

inherit rpm

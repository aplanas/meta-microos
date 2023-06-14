SUMMARY = "Development files for libdeflate"
DESCRIPTION = "The libdeflate-devel package contains libraries and header files for \
developing applications that use libdeflate."
LICENSE = "BSD-2-Clause"

PV = "1.18"

RPM_NAME = "libdeflate-devel-1.18-1.1.aarch64.rpm"
RPM_HASH = "f8820a922c2dacc082f746e557b1925552cb59bd666c77923076997cb7b5ca0331012d9a1f7e14a190583a1dfa341076a31fb252852131b86a8cde1f87bb73f1"

RPROVIDES:${PN} += "cmake-libdeflate \
libdeflate-devel \
pkgconfig-libdeflate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdeflate0"

inherit rpm

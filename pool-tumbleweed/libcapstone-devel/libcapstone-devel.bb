SUMMARY = "Development files to build upon libcapstone"
DESCRIPTION = "Development files to build upon libcapstone, C language only."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone-devel-4.0.2-2.4.aarch64.rpm"
RPM_HASH = "7a4969afbaaafabff61519d93ccab0cfa52a93b077956f16b9558161f2a1f015ca93f4a33b8f9cf49f8f3f70fa72bfc4ae2f192aec6b690414cd94edf421877a"

RPROVIDES:${PN} += "libcapstone-devel \
pkgconfig-capstone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapstone4"

inherit rpm

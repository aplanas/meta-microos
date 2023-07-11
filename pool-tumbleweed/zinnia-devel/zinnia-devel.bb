SUMMARY = "Development files for zinnia"
DESCRIPTION = "The zinnia-devel package contains libraries and header files for \
developing applications that use zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-devel-0.07-2.8.aarch64.rpm"
RPM_HASH = "db247a19d3bdbd2947a220459c76597718c71fd0610d730437a2d0d0106346e5e877f9a2563149f76dae4dba4d7848ed777f426e9892349516866f24847c6058"

RPROVIDES:${PN} += "pkgconfig-zinnia \
zinnia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzinnia0"

inherit rpm

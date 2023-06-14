SUMMARY = "Development files for zinnia"
DESCRIPTION = "The zinnia-devel package contains libraries and header files for \
developing applications that use zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-devel-0.07-2.7.aarch64.rpm"
RPM_HASH = "e83343d06e1870bbd040f31e6e6fd633e53162e9c71c532727cfff294fd4246a546075b173f94724c8900bd7eaff5ed5aaa80c5658a8402acc0d86954e717e80"

RPROVIDES:${PN} += "pkgconfig-zinnia \
zinnia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzinnia0"

inherit rpm

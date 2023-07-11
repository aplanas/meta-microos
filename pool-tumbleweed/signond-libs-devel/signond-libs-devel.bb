SUMMARY = "Development files for signond-libs"
DESCRIPTION = "This package contains the development files for signond-libs."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-libs-devel-8.60-2.19.aarch64.rpm"
RPM_HASH = "3f8edca04b7e7831a7ba2add1cb4a0e39156333c9bd3f2f01ef050901721d9cd45aeb9d9bc37f35bea0e06cab92a199eb6968f5df3061fe14753e78764b2f7a5"

RPROVIDES:${PN} += "pkgconfig-SignOnExtension \
pkgconfig-signond \
signond-libs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt5Core \
signond \
signond-libs"

inherit rpm

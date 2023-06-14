SUMMARY = "Development files for signond-libs"
DESCRIPTION = "This package contains the development files for signond-libs."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-libs-devel-8.60-2.18.aarch64.rpm"
RPM_HASH = "79b21001dac71faab17f606cfabf022116e9bd31c94c00bc897bf57467c315116f3320a34552f83462959e5fa5a2bd50b9989be8ce856d09b4ba8f7106f6f39e"

RPROVIDES:${PN} += "pkgconfig-SignOnExtension \
pkgconfig-signond \
signond-libs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt5Core \
signond \
signond-libs"

inherit rpm

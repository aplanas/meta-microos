SUMMARY = "The libpamtest API documentation"
DESCRIPTION = "Documentation for libpamtest development."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest-devel-doc-1.1.4-2.3.aarch64.rpm"
RPM_HASH = "7eb2db67c10e97ed7da9dae613de966a3fad05f82ddbecda3add868d428565f7100d3d8e8e6df297c2d9093b4d278e64241ca57d29f94977f3f9d16470521759"

RPROVIDES:${PN} += "libpamtest-devel-doc \
libpamtest-devel-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

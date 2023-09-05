SUMMARY = "KDE PIM libraries MIME support"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmime-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "16ec275e4fe3f3ad95acd93296b796c01a43c9f477b54e71e89c8af760a4f9cc8cf2a40829170ecd3b7e930f03d4c2611bf655ea70a0214a04ace2a93bfe614b"

RPROVIDES:${PN} += "kmime"

RDEPENDS:${PN} += ""

inherit rpm

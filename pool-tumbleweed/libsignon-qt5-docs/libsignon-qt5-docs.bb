SUMMARY = "Documentation for libsignon-qt1"
DESCRIPTION = "This package contains the documentation for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-docs-8.60-2.19.noarch.rpm"
RPM_HASH = "47064fb66a9a18519bb523083d76ef7196b63dc04a5029c73e520ebc3bba0d6a31b64439e354d425bce38860c4fa2c09eb3374d1f37576b08422ebadb340d5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsignon-qt5-docs"

RDEPENDS:${PN} += ""

inherit rpm

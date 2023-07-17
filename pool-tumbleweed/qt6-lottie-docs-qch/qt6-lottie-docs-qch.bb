SUMMARY = "Documentation for qt6-lottie in QCH format"
DESCRIPTION = "This package contains documentation for qt6-lottie in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bf9545d941aa906b71cc05c737fd86c239cf942e76e22e569ae5322da076e7ddee88515a97c35b24455915f9b8ca9a6a7120d4d12f2b3bd1ea006c91e2c23893"

RPROVIDES:${PN} += "qt6-lottie-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

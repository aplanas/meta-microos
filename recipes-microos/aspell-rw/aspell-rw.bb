SUMMARY = "Kinyarwanda (Ikinyarwanda) Dictionary for Aspell"
DESCRIPTION = "A Kinyarwanda (Ikinyarwanda) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-rw-0.50-2.14.aarch64.rpm"
RPM_HASH = "6a1f507aad8f86113241abe55a3e92331bda467c4b79cfbb9257051315450f8aab79e2e9b215ff7334ba945ee3dad339ee400b9dcafff9877b23e828abb8de82"

RPROVIDES:${PN} += "aspell-rw \
aspell-rw(aarch-64) \
locale(aspell:rw)"
RDEPENDS:${PN} += ""

inherit rpm

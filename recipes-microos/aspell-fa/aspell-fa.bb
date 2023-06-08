SUMMARY = "Persian (فارسی) Dictionary for Aspell"
DESCRIPTION = "A Persian (فارسی) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.0"

RPM_NAME = "aspell-fa-0.11.0-2.14.aarch64.rpm"
RPM_HASH = "dc443a5ed5899eb13a9be6e8b0e9fdcc68f3c4146843ba0c57572dd6bc459c4e7d1cce2243e9a181b8c23d909d4f35afa7147a62fd370b5c621f0869aee22843"

RPROVIDES:${PN} += "aspell-fa aspell-fa(aarch-64) locale(aspell:fa)"
RDEPENDS:${PN} += ""

inherit rpm

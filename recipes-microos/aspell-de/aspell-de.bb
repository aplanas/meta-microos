SUMMARY = "German (deutsch) Dictionary for Aspell"
DESCRIPTION = "A German (deutsch) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20161207.7.0"

RPM_NAME = "aspell-de-20161207.7.0-2.14.aarch64.rpm"
RPM_HASH = "ee1fc9535aae5fcff137cce56b1531a583c59f99d77d6f850307048ff90e98d20b0f199c07dbe353facf004f33d769b889c71b2d11ac4e07999b76ca7d12ec57"

RPROVIDES:${PN} += "aspell-de \
aspell-de(aarch-64) \
locale(aspell:de)"
RDEPENDS:${PN} += ""

inherit rpm

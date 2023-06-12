SUMMARY = "Asturian (asturianu) Dictionary for Aspell"
DESCRIPTION = "An Asturian (asturianu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-ast-0.01-2.14.aarch64.rpm"
RPM_HASH = "935941fa6503efa16ffc8fbeb6ea0a9d2a6bf589ea379fe08a6e136d9310d75c1b67dec3654c96d1f6c074c4aff953f5a6c753529405a750816010b365c4a829"

RPROVIDES:${PN} += "aspell-ast \
aspell-ast(aarch-64) \
locale(aspell:ast)"
RDEPENDS:${PN} += ""

inherit rpm

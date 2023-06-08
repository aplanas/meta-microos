SUMMARY = "Walloon (walon) Dictionary for Aspell"
DESCRIPTION = "A Walloon (walon) Dictionarydictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-wa-0.50-2.14.aarch64.rpm"
RPM_HASH = "d5b3497632f12bdc50befe98bc8288562fd41f06e61a54537adaf9b09e345fc87c375bf6037347287805aafdaf3d9346384b8c14f271266c42721cab95844816"

RPROVIDES:${PN} += "aspell-wa aspell-wa(aarch-64) locale(aspell:wa)"
RDEPENDS:${PN} += ""

inherit rpm

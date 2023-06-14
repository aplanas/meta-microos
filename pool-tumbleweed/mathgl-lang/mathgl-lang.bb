SUMMARY = "Translations for package mathgl"
DESCRIPTION = "Provides translations for the 'mathgl' package."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-lang-8.0.1-3.3.noarch.rpm"
RPM_HASH = "c35b47f03956a399d545aca2f9b0a2ad7477fa17738f6449b17760ed18271a1a841a65200b899806193447c1ce4f9d4806e10c398462967f4502bf5b1cc40340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mathgl-es \
locale-mathgl-ru \
mathgl-lang \
mathgl-lang-all"

RDEPENDS:${PN} += "mathgl"

inherit rpm

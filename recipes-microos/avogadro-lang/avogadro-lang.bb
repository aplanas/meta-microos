SUMMARY = "Translations for package avogadro"
DESCRIPTION = "Provides translations for the 'avogadro' package."
LICENSE = "GPL-2.0-only"

PV = "1.97.0"

RPM_NAME = "avogadro-lang-1.97.0-1.3.noarch.rpm"
RPM_HASH = "1f6e0922964327a6f731d74aceb83adcbb392f16be78679bb5c1ce211a7f9c884d651d9da8b3d8ac903c3ff38e7c5b7d9a14c88500cee8ad3be7eab4c8eb4ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro-lang avogadro-lang-all"
RDEPENDS:${PN} += "avogadro"

inherit rpm

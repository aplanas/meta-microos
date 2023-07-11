SUMMARY = "Translations for package avogadro"
DESCRIPTION = "Provides translations for the 'avogadro' package."
LICENSE = "GPL-2.0-only"

PV = "1.97.0"

RPM_NAME = "avogadro-lang-1.97.0-1.4.noarch.rpm"
RPM_HASH = "9a13bfc4ab81a2d9acf5aa72832d165e710b5cca12a594f08ab30328e5e76fd2cbef34fbe82090767630941361f21ce36ce43062082bf518067b4c3dc2b70036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro-lang \
avogadro-lang-all"

RDEPENDS:${PN} += "avogadro"

inherit rpm

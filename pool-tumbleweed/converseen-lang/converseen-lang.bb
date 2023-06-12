SUMMARY = "Translations for package converseen"
DESCRIPTION = "Provides translations for the 'converseen' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.11.1"

RPM_NAME = "converseen-lang-0.9.11.1-1.1.noarch.rpm"
RPM_HASH = "6059406dd18bbec4ae890d1e77c0948376866b130b31e8cb4981e71db4d25f5accc19e8a9eb024993ed0c92563347a96b1f9bbf5de1353876850c682425c7570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "converseen-lang \
converseen-lang-all"
RDEPENDS:${PN} += "converseen"

inherit rpm

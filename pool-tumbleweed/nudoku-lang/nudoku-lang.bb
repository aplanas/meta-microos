SUMMARY = "Translations for package nudoku"
DESCRIPTION = "Provides translations for the 'nudoku' package."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "nudoku-lang-2.1.0-1.11.noarch.rpm"
RPM_HASH = "98c1da6e5a08020ae9858d40da6ae125a7c35fe23a44770b831125f803f42a24d5a2fe3d747685c0d143f5f6110a922365773f2101617c570abc0efc79925932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nudoku-de \
locale-nudoku-es \
locale-nudoku-fr \
locale-nudoku-ja \
locale-nudoku-ru \
nudoku-lang \
nudoku-lang-all"

RDEPENDS:${PN} += "nudoku"

inherit rpm

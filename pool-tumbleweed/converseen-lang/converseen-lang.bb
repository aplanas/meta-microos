SUMMARY = "Translations for package converseen"
DESCRIPTION = "Provides translations for the 'converseen' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.11.1"

RPM_NAME = "converseen-lang-0.9.11.1-1.2.noarch.rpm"
RPM_HASH = "d55403c2f2c1ff0ea85121d7747785e86c642bac5653fa7a2212fe577a5d130095f913a8f788658e3aaa010b263c6b5c32d8eb54960ef6b0eb359ea0d9c5ff78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "converseen-lang \
converseen-lang-all"

RDEPENDS:${PN} += "converseen"

inherit rpm

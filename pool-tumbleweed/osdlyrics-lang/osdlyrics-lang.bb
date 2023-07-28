SUMMARY = "Translations for package osdlyrics"
DESCRIPTION = "Provides translations for the 'osdlyrics' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.14"

RPM_NAME = "osdlyrics-lang-0.5.14-1.1.noarch.rpm"
RPM_HASH = "3892cd53e376d846c780ed0b71c42d46d9123af658fb2e7f462ad2100bb7df328e3a477e3986944f3fe14013454530bee4068b227ca7762e7aa5626ac6061d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-osdlyrics-cs \
locale-osdlyrics-de \
locale-osdlyrics-es \
locale-osdlyrics-fr \
locale-osdlyrics-it \
locale-osdlyrics-ms \
locale-osdlyrics-pt-BR \
locale-osdlyrics-ro \
locale-osdlyrics-ru \
locale-osdlyrics-tr \
locale-osdlyrics-uk \
locale-osdlyrics-zh-CN \
locale-osdlyrics-zh-HK \
locale-osdlyrics-zh-TW \
osdlyrics-lang \
osdlyrics-lang-all"

RDEPENDS:${PN} += "osdlyrics"

inherit rpm

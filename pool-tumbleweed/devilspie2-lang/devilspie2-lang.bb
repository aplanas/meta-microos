SUMMARY = "Translations for package devilspie2"
DESCRIPTION = "Provides translations for the 'devilspie2' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.44"

RPM_NAME = "devilspie2-lang-0.44-1.1.noarch.rpm"
RPM_HASH = "df8661801350d5c8ae89b5be3cb129ec35d3284bbe95b6ac3dac4e93d7cb31f0fbac8a231cf4d4a9e04c0d524a7d988ff065f7897bd940efaf28382a8aad12a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "devilspie2-lang \
devilspie2-lang-all \
locale-devilspie2-fi \
locale-devilspie2-fr \
locale-devilspie2-it \
locale-devilspie2-ja \
locale-devilspie2-nl \
locale-devilspie2-pt-BR \
locale-devilspie2-ru \
locale-devilspie2-sv"

RDEPENDS:${PN} += "devilspie2"

inherit rpm

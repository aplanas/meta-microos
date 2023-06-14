SUMMARY = "Translations for package revelation"
DESCRIPTION = "Provides translations for the 'revelation' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "revelation-lang-0.5.4-2.6.noarch.rpm"
RPM_HASH = "0e438b1a049cad1543591e1665ddedea10408f7dd4e688840502fa8ce88400e48e9cd4a8ba1a91a67aab1c64f8cc76623f7ca1fbc33d23965f1faf96ed7456c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-revelation-ca \
locale-revelation-cs \
locale-revelation-de \
locale-revelation-es \
locale-revelation-et \
locale-revelation-eu \
locale-revelation-fi \
locale-revelation-fr \
locale-revelation-it-IT \
locale-revelation-lt \
locale-revelation-nl \
locale-revelation-pl \
locale-revelation-pt-BR \
locale-revelation-ru \
locale-revelation-sv \
locale-revelation-uk \
locale-revelation-zh \
revelation-lang \
revelation-lang-all"

RDEPENDS:${PN} += "revelation"

inherit rpm

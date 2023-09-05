SUMMARY = "Translations for package knights"
DESCRIPTION = "Provides translations for the 'knights' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "knights-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "37c2c4e6bad20099f48cb26fcc5528cebb01bf7497fb1cd1396130f304a3bb450849b0353c7ec479302f671d86d4a73663ac7acdd25b360815da87b09052bbe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knights-lang \
knights-lang-all \
locale-knights-ar \
locale-knights-bg \
locale-knights-bs \
locale-knights-ca \
locale-knights-ca@valencia \
locale-knights-cs \
locale-knights-da \
locale-knights-de \
locale-knights-el \
locale-knights-en-GB \
locale-knights-eo \
locale-knights-es \
locale-knights-et \
locale-knights-eu \
locale-knights-fa \
locale-knights-fi \
locale-knights-fr \
locale-knights-ga \
locale-knights-gl \
locale-knights-hu \
locale-knights-id \
locale-knights-it \
locale-knights-ja \
locale-knights-ka \
locale-knights-km \
locale-knights-ko \
locale-knights-lt \
locale-knights-ml \
locale-knights-mr \
locale-knights-nb \
locale-knights-nds \
locale-knights-nl \
locale-knights-nn \
locale-knights-pl \
locale-knights-pt \
locale-knights-pt-BR \
locale-knights-ro \
locale-knights-ru \
locale-knights-sk \
locale-knights-sl \
locale-knights-sr \
locale-knights-sr@ijekavian \
locale-knights-sr@ijekavianlatin \
locale-knights-sr@latin \
locale-knights-sv \
locale-knights-tr \
locale-knights-ug \
locale-knights-uk \
locale-knights-zh-CN \
locale-knights-zh-TW"

RDEPENDS:${PN} += "knights"

inherit rpm

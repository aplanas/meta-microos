SUMMARY = "Translations for package kdenlive"
DESCRIPTION = "Provides translations for the 'kdenlive' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdenlive-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "47bfbf00cb05e936e96c1b4a0213f8566038240f7c97e07d7756a3e1fb07fabe047e3c8f008bc39ca5c63e1740599e2cfb0ab4e222c43718bb18762ecfdc7882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenlive-lang \
kdenlive-lang-all \
locale-kdenlive-ar \
locale-kdenlive-az \
locale-kdenlive-bs \
locale-kdenlive-ca \
locale-kdenlive-ca@valencia \
locale-kdenlive-cs \
locale-kdenlive-da \
locale-kdenlive-de \
locale-kdenlive-el \
locale-kdenlive-en-GB \
locale-kdenlive-es \
locale-kdenlive-et \
locale-kdenlive-eu \
locale-kdenlive-fi \
locale-kdenlive-fr \
locale-kdenlive-ga \
locale-kdenlive-gl \
locale-kdenlive-he \
locale-kdenlive-hr \
locale-kdenlive-hu \
locale-kdenlive-id \
locale-kdenlive-it \
locale-kdenlive-ja \
locale-kdenlive-ka \
locale-kdenlive-ko \
locale-kdenlive-lt \
locale-kdenlive-mr \
locale-kdenlive-nb \
locale-kdenlive-nds \
locale-kdenlive-nl \
locale-kdenlive-pl \
locale-kdenlive-pt \
locale-kdenlive-pt-BR \
locale-kdenlive-ro \
locale-kdenlive-ru \
locale-kdenlive-sk \
locale-kdenlive-sl \
locale-kdenlive-sv \
locale-kdenlive-tr \
locale-kdenlive-ug \
locale-kdenlive-uk \
locale-kdenlive-zh-CN \
locale-kdenlive-zh-TW"

RDEPENDS:${PN} += "kdenlive"

inherit rpm

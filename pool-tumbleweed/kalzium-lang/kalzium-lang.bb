SUMMARY = "Translations for package kalzium"
DESCRIPTION = "Provides translations for the 'kalzium' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalzium-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "7387a6ed339e518301fbd49a5bb05c019455532933da45a395000bc698c8d2ea06610fc1fc9504a9cedc0df8045c6df7f2c29c5cf7ccb9e53676ea437c11a895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalzium-lang \
kalzium-lang-all \
locale-kalzium-af \
locale-kalzium-ar \
locale-kalzium-be \
locale-kalzium-bg \
locale-kalzium-bn \
locale-kalzium-br \
locale-kalzium-bs \
locale-kalzium-ca \
locale-kalzium-ca@valencia \
locale-kalzium-cs \
locale-kalzium-cy \
locale-kalzium-da \
locale-kalzium-de \
locale-kalzium-el \
locale-kalzium-en-GB \
locale-kalzium-eo \
locale-kalzium-es \
locale-kalzium-et \
locale-kalzium-eu \
locale-kalzium-fa \
locale-kalzium-fi \
locale-kalzium-fr \
locale-kalzium-ga \
locale-kalzium-gl \
locale-kalzium-gu \
locale-kalzium-he \
locale-kalzium-hi \
locale-kalzium-hr \
locale-kalzium-hu \
locale-kalzium-is \
locale-kalzium-it \
locale-kalzium-ja \
locale-kalzium-ka \
locale-kalzium-kk \
locale-kalzium-km \
locale-kalzium-ko \
locale-kalzium-lt \
locale-kalzium-lv \
locale-kalzium-mai \
locale-kalzium-mk \
locale-kalzium-ml \
locale-kalzium-mr \
locale-kalzium-ms \
locale-kalzium-nb \
locale-kalzium-nds \
locale-kalzium-ne \
locale-kalzium-nl \
locale-kalzium-nn \
locale-kalzium-oc \
locale-kalzium-pa \
locale-kalzium-pl \
locale-kalzium-pt \
locale-kalzium-pt-BR \
locale-kalzium-ro \
locale-kalzium-ru \
locale-kalzium-si \
locale-kalzium-sk \
locale-kalzium-sl \
locale-kalzium-sq \
locale-kalzium-sv \
locale-kalzium-ta \
locale-kalzium-th \
locale-kalzium-tr \
locale-kalzium-ug \
locale-kalzium-uk \
locale-kalzium-zh-CN \
locale-kalzium-zh-TW"

RDEPENDS:${PN} += "kalzium"

inherit rpm

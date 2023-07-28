SUMMARY = "Translations for package cinnamon-screensaver"
DESCRIPTION = "Provides translations for the 'cinnamon-screensaver' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.2"

RPM_NAME = "cinnamon-screensaver-lang-5.8.2-1.1.noarch.rpm"
RPM_HASH = "15ce105565e9eb080277e2c1bd8ac22cc3a9a5c9ab57dc9ffbfb5dc3a80854247da545b089470203d154456f5cefc069be0f813c1cd3509a285a02882b25d80f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-screensaver-lang \
cinnamon-screensaver-lang-all \
locale-cinnamon-screensaver-af \
locale-cinnamon-screensaver-ar \
locale-cinnamon-screensaver-as \
locale-cinnamon-screensaver-ast \
locale-cinnamon-screensaver-az \
locale-cinnamon-screensaver-be \
locale-cinnamon-screensaver-be@latin \
locale-cinnamon-screensaver-bg \
locale-cinnamon-screensaver-bn \
locale-cinnamon-screensaver-bn-IN \
locale-cinnamon-screensaver-br \
locale-cinnamon-screensaver-bs \
locale-cinnamon-screensaver-ca \
locale-cinnamon-screensaver-ca@valencia \
locale-cinnamon-screensaver-cs \
locale-cinnamon-screensaver-cy \
locale-cinnamon-screensaver-da \
locale-cinnamon-screensaver-de \
locale-cinnamon-screensaver-dz \
locale-cinnamon-screensaver-el \
locale-cinnamon-screensaver-en-AU \
locale-cinnamon-screensaver-en-CA \
locale-cinnamon-screensaver-en-GB \
locale-cinnamon-screensaver-en@shaw \
locale-cinnamon-screensaver-eo \
locale-cinnamon-screensaver-es \
locale-cinnamon-screensaver-et \
locale-cinnamon-screensaver-eu \
locale-cinnamon-screensaver-fa \
locale-cinnamon-screensaver-fi \
locale-cinnamon-screensaver-fr \
locale-cinnamon-screensaver-fr-CA \
locale-cinnamon-screensaver-ga \
locale-cinnamon-screensaver-gd \
locale-cinnamon-screensaver-gl \
locale-cinnamon-screensaver-gu \
locale-cinnamon-screensaver-he \
locale-cinnamon-screensaver-hi \
locale-cinnamon-screensaver-hr \
locale-cinnamon-screensaver-hu \
locale-cinnamon-screensaver-ia \
locale-cinnamon-screensaver-id \
locale-cinnamon-screensaver-is \
locale-cinnamon-screensaver-it \
locale-cinnamon-screensaver-ja \
locale-cinnamon-screensaver-ka \
locale-cinnamon-screensaver-kk \
locale-cinnamon-screensaver-km \
locale-cinnamon-screensaver-kn \
locale-cinnamon-screensaver-ko \
locale-cinnamon-screensaver-lt \
locale-cinnamon-screensaver-lv \
locale-cinnamon-screensaver-mai \
locale-cinnamon-screensaver-mk \
locale-cinnamon-screensaver-ml \
locale-cinnamon-screensaver-mr \
locale-cinnamon-screensaver-ms \
locale-cinnamon-screensaver-nb \
locale-cinnamon-screensaver-nds \
locale-cinnamon-screensaver-ne \
locale-cinnamon-screensaver-nl \
locale-cinnamon-screensaver-nn \
locale-cinnamon-screensaver-oc \
locale-cinnamon-screensaver-or \
locale-cinnamon-screensaver-pa \
locale-cinnamon-screensaver-pl \
locale-cinnamon-screensaver-pt \
locale-cinnamon-screensaver-pt-BR \
locale-cinnamon-screensaver-ro \
locale-cinnamon-screensaver-ru \
locale-cinnamon-screensaver-si \
locale-cinnamon-screensaver-sk \
locale-cinnamon-screensaver-sl \
locale-cinnamon-screensaver-sq \
locale-cinnamon-screensaver-sr \
locale-cinnamon-screensaver-sr@latin \
locale-cinnamon-screensaver-sv \
locale-cinnamon-screensaver-ta \
locale-cinnamon-screensaver-te \
locale-cinnamon-screensaver-th \
locale-cinnamon-screensaver-tr \
locale-cinnamon-screensaver-ug \
locale-cinnamon-screensaver-uk \
locale-cinnamon-screensaver-vi \
locale-cinnamon-screensaver-zh-CN \
locale-cinnamon-screensaver-zh-HK \
locale-cinnamon-screensaver-zh-TW"

RDEPENDS:${PN} += "cinnamon-screensaver"

inherit rpm

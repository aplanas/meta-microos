SUMMARY = "Translations for package cinnamon-session"
DESCRIPTION = "Provides translations for the 'cinnamon-session' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.2"

RPM_NAME = "cinnamon-session-lang-5.8.2-1.1.noarch.rpm"
RPM_HASH = "fbe68f6c20e8fddc9b27f88cc192def9acc001a1c30f745f2e6c750bef2fa3bd9cc42bda3052adb9cfbb04f479399ce09109837bed9549ce2c843a08868fff47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-session-lang \
cinnamon-session-lang-all \
locale-cinnamon-session-af \
locale-cinnamon-session-ar \
locale-cinnamon-session-as \
locale-cinnamon-session-ast \
locale-cinnamon-session-az \
locale-cinnamon-session-be \
locale-cinnamon-session-be@latin \
locale-cinnamon-session-bg \
locale-cinnamon-session-bn \
locale-cinnamon-session-bn-IN \
locale-cinnamon-session-br \
locale-cinnamon-session-bs \
locale-cinnamon-session-ca \
locale-cinnamon-session-ca@valencia \
locale-cinnamon-session-cs \
locale-cinnamon-session-cy \
locale-cinnamon-session-da \
locale-cinnamon-session-de \
locale-cinnamon-session-dz \
locale-cinnamon-session-el \
locale-cinnamon-session-en-AU \
locale-cinnamon-session-en-CA \
locale-cinnamon-session-en-GB \
locale-cinnamon-session-en@shaw \
locale-cinnamon-session-eo \
locale-cinnamon-session-es \
locale-cinnamon-session-et \
locale-cinnamon-session-eu \
locale-cinnamon-session-fa \
locale-cinnamon-session-fi \
locale-cinnamon-session-fr \
locale-cinnamon-session-fr-CA \
locale-cinnamon-session-fur \
locale-cinnamon-session-ga \
locale-cinnamon-session-gd \
locale-cinnamon-session-gl \
locale-cinnamon-session-gu \
locale-cinnamon-session-he \
locale-cinnamon-session-hi \
locale-cinnamon-session-hr \
locale-cinnamon-session-hu \
locale-cinnamon-session-ia \
locale-cinnamon-session-id \
locale-cinnamon-session-is \
locale-cinnamon-session-it \
locale-cinnamon-session-ja \
locale-cinnamon-session-ka \
locale-cinnamon-session-kk \
locale-cinnamon-session-km \
locale-cinnamon-session-kn \
locale-cinnamon-session-ko \
locale-cinnamon-session-lt \
locale-cinnamon-session-lv \
locale-cinnamon-session-mai \
locale-cinnamon-session-mk \
locale-cinnamon-session-ml \
locale-cinnamon-session-mr \
locale-cinnamon-session-ms \
locale-cinnamon-session-nb \
locale-cinnamon-session-nds \
locale-cinnamon-session-ne \
locale-cinnamon-session-nl \
locale-cinnamon-session-nn \
locale-cinnamon-session-oc \
locale-cinnamon-session-or \
locale-cinnamon-session-pa \
locale-cinnamon-session-pl \
locale-cinnamon-session-pt \
locale-cinnamon-session-pt-BR \
locale-cinnamon-session-ro \
locale-cinnamon-session-ru \
locale-cinnamon-session-si \
locale-cinnamon-session-sk \
locale-cinnamon-session-sl \
locale-cinnamon-session-sq \
locale-cinnamon-session-sr \
locale-cinnamon-session-sr@latin \
locale-cinnamon-session-sv \
locale-cinnamon-session-ta \
locale-cinnamon-session-te \
locale-cinnamon-session-th \
locale-cinnamon-session-tr \
locale-cinnamon-session-ug \
locale-cinnamon-session-uk \
locale-cinnamon-session-vi \
locale-cinnamon-session-wa \
locale-cinnamon-session-zh-CN \
locale-cinnamon-session-zh-HK \
locale-cinnamon-session-zh-TW"

RDEPENDS:${PN} += "cinnamon-session"

inherit rpm

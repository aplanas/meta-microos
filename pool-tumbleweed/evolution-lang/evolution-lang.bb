SUMMARY = "Translations for package evolution"
DESCRIPTION = "Provides translations for the 'evolution' package."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-lang-3.48.4-1.1.noarch.rpm"
RPM_HASH = "c802c4b56ed0705f45c1f3257fc7cb485c966c1e35fd6d22340519ce313ce031bd3d838ab5e9554580f9d6f48ff8ee7093879a6affbb370b85ef1d61252d3d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "evolution-lang \
evolution-lang-all \
locale-evolution-af \
locale-evolution-ar \
locale-evolution-as \
locale-evolution-ast \
locale-evolution-az \
locale-evolution-be \
locale-evolution-be@latin \
locale-evolution-bg \
locale-evolution-bn \
locale-evolution-bn-IN \
locale-evolution-br \
locale-evolution-bs \
locale-evolution-ca \
locale-evolution-ca@valencia \
locale-evolution-cs \
locale-evolution-cy \
locale-evolution-da \
locale-evolution-de \
locale-evolution-dz \
locale-evolution-el \
locale-evolution-en-AU \
locale-evolution-en-CA \
locale-evolution-en-GB \
locale-evolution-en@shaw \
locale-evolution-eo \
locale-evolution-es \
locale-evolution-et \
locale-evolution-eu \
locale-evolution-fa \
locale-evolution-fi \
locale-evolution-fr \
locale-evolution-fur \
locale-evolution-ga \
locale-evolution-gl \
locale-evolution-gu \
locale-evolution-he \
locale-evolution-hi \
locale-evolution-hr \
locale-evolution-hu \
locale-evolution-id \
locale-evolution-is \
locale-evolution-it \
locale-evolution-ja \
locale-evolution-ka \
locale-evolution-kk \
locale-evolution-kn \
locale-evolution-ko \
locale-evolution-lt \
locale-evolution-lv \
locale-evolution-mai \
locale-evolution-mk \
locale-evolution-ml \
locale-evolution-mr \
locale-evolution-ms \
locale-evolution-nb \
locale-evolution-nds \
locale-evolution-ne \
locale-evolution-nl \
locale-evolution-nn \
locale-evolution-oc \
locale-evolution-or \
locale-evolution-pa \
locale-evolution-pl \
locale-evolution-pt \
locale-evolution-pt-BR \
locale-evolution-ro \
locale-evolution-ru \
locale-evolution-si \
locale-evolution-sk \
locale-evolution-sl \
locale-evolution-sq \
locale-evolution-sr \
locale-evolution-sr@latin \
locale-evolution-sv \
locale-evolution-ta \
locale-evolution-te \
locale-evolution-th \
locale-evolution-tr \
locale-evolution-ug \
locale-evolution-uk \
locale-evolution-vi \
locale-evolution-wa \
locale-evolution-zh-CN \
locale-evolution-zh-HK \
locale-evolution-zh-TW"

RDEPENDS:${PN} += "evolution"

inherit rpm

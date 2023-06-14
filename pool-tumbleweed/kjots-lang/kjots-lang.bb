SUMMARY = "Translations for package kjots"
DESCRIPTION = "Provides translations for the 'kjots' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.1"

RPM_NAME = "kjots-lang-5.1.1-1.1.noarch.rpm"
RPM_HASH = "b7a0b6738f65d54d1b2d683370771ffd64c3231026367377ace58eec0030d876e34fcc79fd81485a0d448d698f5679594d406731a10536f7fd1bcb10fffa9ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjots-lang \
kjots-lang-all \
locale-kjots-af \
locale-kjots-ar \
locale-kjots-be \
locale-kjots-bg \
locale-kjots-br \
locale-kjots-bs \
locale-kjots-ca \
locale-kjots-ca@valencia \
locale-kjots-cs \
locale-kjots-cy \
locale-kjots-da \
locale-kjots-de \
locale-kjots-el \
locale-kjots-en-GB \
locale-kjots-eo \
locale-kjots-es \
locale-kjots-et \
locale-kjots-eu \
locale-kjots-fa \
locale-kjots-fi \
locale-kjots-fr \
locale-kjots-ga \
locale-kjots-gl \
locale-kjots-he \
locale-kjots-hi \
locale-kjots-hr \
locale-kjots-hu \
locale-kjots-ia \
locale-kjots-is \
locale-kjots-it \
locale-kjots-ja \
locale-kjots-ka \
locale-kjots-kk \
locale-kjots-km \
locale-kjots-ko \
locale-kjots-lt \
locale-kjots-lv \
locale-kjots-mai \
locale-kjots-mk \
locale-kjots-mr \
locale-kjots-ms \
locale-kjots-nb \
locale-kjots-nds \
locale-kjots-ne \
locale-kjots-nl \
locale-kjots-nn \
locale-kjots-oc \
locale-kjots-pa \
locale-kjots-pl \
locale-kjots-pt \
locale-kjots-pt-BR \
locale-kjots-ro \
locale-kjots-ru \
locale-kjots-sk \
locale-kjots-sl \
locale-kjots-sv \
locale-kjots-ta \
locale-kjots-th \
locale-kjots-tr \
locale-kjots-ug \
locale-kjots-uk \
locale-kjots-wa \
locale-kjots-zh-CN \
locale-kjots-zh-TW"

RDEPENDS:${PN} += "kjots"

inherit rpm

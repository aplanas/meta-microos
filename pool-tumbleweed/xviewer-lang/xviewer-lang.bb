SUMMARY = "Translations for package xviewer"
DESCRIPTION = "Provides translations for the 'xviewer' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-lang-3.2.4-1.8.noarch.rpm"
RPM_HASH = "1195082c36cfdca4037800178ef56b85096983f43efd59b9a2908cf08cca1ce224cfb246b05bd930d54e7e5b3301e45956c793a74e72c42374ebcb0ff512b3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xviewer-af \
locale-xviewer-ar \
locale-xviewer-as \
locale-xviewer-ast \
locale-xviewer-az \
locale-xviewer-be \
locale-xviewer-be@latin \
locale-xviewer-bg \
locale-xviewer-bn \
locale-xviewer-bn-IN \
locale-xviewer-br \
locale-xviewer-bs \
locale-xviewer-ca \
locale-xviewer-ca@valencia \
locale-xviewer-cs \
locale-xviewer-cy \
locale-xviewer-da \
locale-xviewer-de \
locale-xviewer-dz \
locale-xviewer-el \
locale-xviewer-en-CA \
locale-xviewer-en-GB \
locale-xviewer-en@shaw \
locale-xviewer-eo \
locale-xviewer-es \
locale-xviewer-et \
locale-xviewer-eu \
locale-xviewer-fa \
locale-xviewer-fi \
locale-xviewer-fr \
locale-xviewer-fur \
locale-xviewer-ga \
locale-xviewer-gd \
locale-xviewer-gl \
locale-xviewer-gu \
locale-xviewer-he \
locale-xviewer-hi \
locale-xviewer-hr \
locale-xviewer-hu \
locale-xviewer-ia \
locale-xviewer-id \
locale-xviewer-is \
locale-xviewer-it \
locale-xviewer-ja \
locale-xviewer-ka \
locale-xviewer-kk \
locale-xviewer-km \
locale-xviewer-kn \
locale-xviewer-ko \
locale-xviewer-lt \
locale-xviewer-lv \
locale-xviewer-mai \
locale-xviewer-mk \
locale-xviewer-ml \
locale-xviewer-mr \
locale-xviewer-ms \
locale-xviewer-nb \
locale-xviewer-nds \
locale-xviewer-ne \
locale-xviewer-nl \
locale-xviewer-nn \
locale-xviewer-oc \
locale-xviewer-or \
locale-xviewer-pa \
locale-xviewer-pl \
locale-xviewer-pt \
locale-xviewer-pt-BR \
locale-xviewer-ro \
locale-xviewer-ru \
locale-xviewer-si \
locale-xviewer-sk \
locale-xviewer-sl \
locale-xviewer-sq \
locale-xviewer-sr \
locale-xviewer-sr@latin \
locale-xviewer-sv \
locale-xviewer-ta \
locale-xviewer-te \
locale-xviewer-th \
locale-xviewer-tr \
locale-xviewer-ug \
locale-xviewer-uk \
locale-xviewer-vi \
locale-xviewer-wa \
locale-xviewer-zh-CN \
locale-xviewer-zh-HK \
locale-xviewer-zh-TW \
xviewer-lang \
xviewer-lang-all"

RDEPENDS:${PN} += "xviewer"

inherit rpm

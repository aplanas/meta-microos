SUMMARY = "Translations for package calligra-plan"
DESCRIPTION = "Provides translations for the 'calligra-plan' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "calligra-plan-lang-3.3.0-2.10.noarch.rpm"
RPM_HASH = "587f2d42a8cffa62823779cbfd683c73de1a2390a3fd534d015b7e8a4552466729df10fcc53c7e3d6d950aac57c448dac65ed4cc4aab14a88db3c867bc6b63b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-plan-lang \
calligra-plan-lang-all \
locale-calligra-plan-ar \
locale-calligra-plan-ast \
locale-calligra-plan-be \
locale-calligra-plan-bg \
locale-calligra-plan-br \
locale-calligra-plan-bs \
locale-calligra-plan-ca \
locale-calligra-plan-ca@valencia \
locale-calligra-plan-cs \
locale-calligra-plan-da \
locale-calligra-plan-de \
locale-calligra-plan-el \
locale-calligra-plan-en-GB \
locale-calligra-plan-eo \
locale-calligra-plan-es \
locale-calligra-plan-et \
locale-calligra-plan-eu \
locale-calligra-plan-fa \
locale-calligra-plan-fi \
locale-calligra-plan-fr \
locale-calligra-plan-ga \
locale-calligra-plan-gl \
locale-calligra-plan-hi \
locale-calligra-plan-hu \
locale-calligra-plan-ia \
locale-calligra-plan-id \
locale-calligra-plan-it \
locale-calligra-plan-ja \
locale-calligra-plan-kk \
locale-calligra-plan-km \
locale-calligra-plan-ko \
locale-calligra-plan-lt \
locale-calligra-plan-lv \
locale-calligra-plan-mai \
locale-calligra-plan-mr \
locale-calligra-plan-nb \
locale-calligra-plan-nds \
locale-calligra-plan-ne \
locale-calligra-plan-nl \
locale-calligra-plan-nn \
locale-calligra-plan-oc \
locale-calligra-plan-pl \
locale-calligra-plan-pt \
locale-calligra-plan-pt-BR \
locale-calligra-plan-ro \
locale-calligra-plan-ru \
locale-calligra-plan-sk \
locale-calligra-plan-sl \
locale-calligra-plan-sv \
locale-calligra-plan-th \
locale-calligra-plan-tr \
locale-calligra-plan-ug \
locale-calligra-plan-uk \
locale-calligra-plan-wa \
locale-calligra-plan-zh-CN \
locale-calligra-plan-zh-TW"

RDEPENDS:${PN} += "calligra-plan"

inherit rpm

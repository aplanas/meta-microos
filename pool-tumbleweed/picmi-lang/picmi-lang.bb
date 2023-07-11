SUMMARY = "Translations for package picmi"
DESCRIPTION = "Provides translations for the 'picmi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "picmi-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "602a60c63a5df57bf77af1aac74e0089bd258c8b05f42a65cca1abd4fa4b27f1f26e5509a6c1703a5780a87eb77ddc8542cdbde1cf2d5146c21cbd00cf604ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-picmi-bs \
locale-picmi-ca \
locale-picmi-ca@valencia \
locale-picmi-cs \
locale-picmi-da \
locale-picmi-de \
locale-picmi-el \
locale-picmi-en-GB \
locale-picmi-es \
locale-picmi-et \
locale-picmi-eu \
locale-picmi-fi \
locale-picmi-fr \
locale-picmi-ga \
locale-picmi-gl \
locale-picmi-hu \
locale-picmi-it \
locale-picmi-ja \
locale-picmi-ka \
locale-picmi-kk \
locale-picmi-ko \
locale-picmi-lt \
locale-picmi-lv \
locale-picmi-ml \
locale-picmi-mr \
locale-picmi-nb \
locale-picmi-nds \
locale-picmi-nl \
locale-picmi-nn \
locale-picmi-pl \
locale-picmi-pt \
locale-picmi-pt-BR \
locale-picmi-ro \
locale-picmi-ru \
locale-picmi-sk \
locale-picmi-sl \
locale-picmi-sr \
locale-picmi-sr@ijekavian \
locale-picmi-sr@ijekavianlatin \
locale-picmi-sr@latin \
locale-picmi-sv \
locale-picmi-tr \
locale-picmi-ug \
locale-picmi-uk \
locale-picmi-zh-CN \
locale-picmi-zh-TW \
picmi-lang \
picmi-lang-all"

RDEPENDS:${PN} += "picmi"

inherit rpm

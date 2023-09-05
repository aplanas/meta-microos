SUMMARY = "Translations for package picmi"
DESCRIPTION = "Provides translations for the 'picmi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "picmi-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "bdb77ea66e543a24dfcc3378db93a79f8af497898acf48d4ae2b2e6b5fa20d0de09cc8711a2277f4c84fcaf24231f26dfa8c8a53171ab2402f15731b2349e2ab"
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

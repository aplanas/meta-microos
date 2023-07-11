SUMMARY = "Translations for package kigo"
DESCRIPTION = "Provides translations for the 'kigo' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kigo-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "d30020c8cca563ab1837db51f9b3795d51197c61228d7a0554491259a2783d29b7b828e0c1b83727514e8e38ef8385359cdd630d1a4d65737a7365dd9a0d3452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kigo-lang \
kigo-lang-all \
locale-kigo-ar \
locale-kigo-bg \
locale-kigo-bs \
locale-kigo-ca \
locale-kigo-ca@valencia \
locale-kigo-cs \
locale-kigo-da \
locale-kigo-de \
locale-kigo-el \
locale-kigo-en-GB \
locale-kigo-eo \
locale-kigo-es \
locale-kigo-et \
locale-kigo-eu \
locale-kigo-fi \
locale-kigo-fr \
locale-kigo-ga \
locale-kigo-gl \
locale-kigo-hr \
locale-kigo-hu \
locale-kigo-id \
locale-kigo-is \
locale-kigo-it \
locale-kigo-ja \
locale-kigo-ka \
locale-kigo-kk \
locale-kigo-km \
locale-kigo-ko \
locale-kigo-lt \
locale-kigo-lv \
locale-kigo-mai \
locale-kigo-ml \
locale-kigo-mr \
locale-kigo-ms \
locale-kigo-nb \
locale-kigo-nds \
locale-kigo-nl \
locale-kigo-nn \
locale-kigo-pl \
locale-kigo-pt \
locale-kigo-pt-BR \
locale-kigo-ro \
locale-kigo-ru \
locale-kigo-sk \
locale-kigo-sl \
locale-kigo-sr \
locale-kigo-sr@ijekavian \
locale-kigo-sr@ijekavianlatin \
locale-kigo-sr@latin \
locale-kigo-sv \
locale-kigo-th \
locale-kigo-tr \
locale-kigo-ug \
locale-kigo-uk \
locale-kigo-zh-CN \
locale-kigo-zh-TW"

RDEPENDS:${PN} += "kigo"

inherit rpm

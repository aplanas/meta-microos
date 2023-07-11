SUMMARY = "Translations for package svgpart"
DESCRIPTION = "Provides translations for the 'svgpart' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "svgpart-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "077a950806524eda12aa005fcd18d2eda6fe82e0879c0ddb97af6a6fe86aa3a35ad4cfb809a7f51aa326c34f22f809ae72185fbe7f11993c8ac320411c6fac60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-svgpart-ar \
locale-svgpart-be \
locale-svgpart-bg \
locale-svgpart-bs \
locale-svgpart-ca \
locale-svgpart-ca@valencia \
locale-svgpart-cs \
locale-svgpart-da \
locale-svgpart-de \
locale-svgpart-el \
locale-svgpart-en-GB \
locale-svgpart-eo \
locale-svgpart-es \
locale-svgpart-et \
locale-svgpart-eu \
locale-svgpart-fi \
locale-svgpart-fr \
locale-svgpart-ga \
locale-svgpart-gl \
locale-svgpart-hi \
locale-svgpart-hr \
locale-svgpart-hu \
locale-svgpart-ia \
locale-svgpart-id \
locale-svgpart-is \
locale-svgpart-it \
locale-svgpart-ja \
locale-svgpart-ka \
locale-svgpart-kk \
locale-svgpart-km \
locale-svgpart-ko \
locale-svgpart-lt \
locale-svgpart-lv \
locale-svgpart-mk \
locale-svgpart-ml \
locale-svgpart-mr \
locale-svgpart-nb \
locale-svgpart-nds \
locale-svgpart-nl \
locale-svgpart-nn \
locale-svgpart-pa \
locale-svgpart-pl \
locale-svgpart-pt \
locale-svgpart-pt-BR \
locale-svgpart-ro \
locale-svgpart-ru \
locale-svgpart-si \
locale-svgpart-sk \
locale-svgpart-sl \
locale-svgpart-sq \
locale-svgpart-sv \
locale-svgpart-ta \
locale-svgpart-th \
locale-svgpart-tr \
locale-svgpart-ug \
locale-svgpart-uk \
locale-svgpart-vi \
locale-svgpart-wa \
locale-svgpart-zh-CN \
locale-svgpart-zh-TW \
svgpart-lang \
svgpart-lang-all"

RDEPENDS:${PN} += "svgpart"

inherit rpm

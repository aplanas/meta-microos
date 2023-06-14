SUMMARY = "Translations for package thunar-plugin-archive"
DESCRIPTION = "Provides translations for the 'thunar-plugin-archive' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "thunar-plugin-archive-lang-0.5.1-1.1.noarch.rpm"
RPM_HASH = "9750ebcf1212fd67207965ac1e69822baf691f9bdfc7abb6e93fe1f94bfd18ff066a7b20ec5e6481451cd12aafadd945f9cd35c5b8bdfb45e4dd15e7e62d76ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-plugin-archive-ar \
locale-thunar-plugin-archive-be \
locale-thunar-plugin-archive-bg \
locale-thunar-plugin-archive-ca \
locale-thunar-plugin-archive-cs \
locale-thunar-plugin-archive-da \
locale-thunar-plugin-archive-de \
locale-thunar-plugin-archive-el \
locale-thunar-plugin-archive-en-AU \
locale-thunar-plugin-archive-en-CA \
locale-thunar-plugin-archive-en-GB \
locale-thunar-plugin-archive-eo \
locale-thunar-plugin-archive-es \
locale-thunar-plugin-archive-et \
locale-thunar-plugin-archive-eu \
locale-thunar-plugin-archive-fi \
locale-thunar-plugin-archive-fr \
locale-thunar-plugin-archive-gl \
locale-thunar-plugin-archive-he \
locale-thunar-plugin-archive-hi \
locale-thunar-plugin-archive-hr \
locale-thunar-plugin-archive-hu \
locale-thunar-plugin-archive-id \
locale-thunar-plugin-archive-is \
locale-thunar-plugin-archive-it \
locale-thunar-plugin-archive-ja \
locale-thunar-plugin-archive-ko \
locale-thunar-plugin-archive-lt \
locale-thunar-plugin-archive-lv \
locale-thunar-plugin-archive-ms \
locale-thunar-plugin-archive-nb \
locale-thunar-plugin-archive-nl \
locale-thunar-plugin-archive-nn \
locale-thunar-plugin-archive-oc \
locale-thunar-plugin-archive-pa \
locale-thunar-plugin-archive-pl \
locale-thunar-plugin-archive-pt \
locale-thunar-plugin-archive-pt-BR \
locale-thunar-plugin-archive-ro \
locale-thunar-plugin-archive-ru \
locale-thunar-plugin-archive-sk \
locale-thunar-plugin-archive-sl \
locale-thunar-plugin-archive-sq \
locale-thunar-plugin-archive-sr \
locale-thunar-plugin-archive-sv \
locale-thunar-plugin-archive-th \
locale-thunar-plugin-archive-tr \
locale-thunar-plugin-archive-ug \
locale-thunar-plugin-archive-uk \
locale-thunar-plugin-archive-vi \
locale-thunar-plugin-archive-zh-CN \
locale-thunar-plugin-archive-zh-TW \
thunar-plugin-archive-lang \
thunar-plugin-archive-lang-all"

RDEPENDS:${PN} += "thunar-plugin-archive"

inherit rpm

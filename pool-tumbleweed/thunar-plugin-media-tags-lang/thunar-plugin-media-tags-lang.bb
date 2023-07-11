SUMMARY = "Translations for package thunar-plugin-media-tags"
DESCRIPTION = "Provides translations for the 'thunar-plugin-media-tags' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "thunar-plugin-media-tags-lang-0.4.0-1.4.noarch.rpm"
RPM_HASH = "c94c918fed351c67c80dd8286035129c1f6aa95e0c9e7d1d78591d89272f16cd219eda6e969f4c909b2e74896be99cec199c01b07d6a08a47805e3c7f48dada5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-plugin-media-tags-ar \
locale-thunar-plugin-media-tags-be \
locale-thunar-plugin-media-tags-bg \
locale-thunar-plugin-media-tags-ca \
locale-thunar-plugin-media-tags-cs \
locale-thunar-plugin-media-tags-da \
locale-thunar-plugin-media-tags-de \
locale-thunar-plugin-media-tags-el \
locale-thunar-plugin-media-tags-en-AU \
locale-thunar-plugin-media-tags-en-CA \
locale-thunar-plugin-media-tags-en-GB \
locale-thunar-plugin-media-tags-eo \
locale-thunar-plugin-media-tags-es \
locale-thunar-plugin-media-tags-et \
locale-thunar-plugin-media-tags-eu \
locale-thunar-plugin-media-tags-fi \
locale-thunar-plugin-media-tags-fr \
locale-thunar-plugin-media-tags-gl \
locale-thunar-plugin-media-tags-he \
locale-thunar-plugin-media-tags-hr \
locale-thunar-plugin-media-tags-hu \
locale-thunar-plugin-media-tags-id \
locale-thunar-plugin-media-tags-is \
locale-thunar-plugin-media-tags-it \
locale-thunar-plugin-media-tags-ja \
locale-thunar-plugin-media-tags-ko \
locale-thunar-plugin-media-tags-lt \
locale-thunar-plugin-media-tags-lv \
locale-thunar-plugin-media-tags-ms \
locale-thunar-plugin-media-tags-nb \
locale-thunar-plugin-media-tags-nl \
locale-thunar-plugin-media-tags-nn \
locale-thunar-plugin-media-tags-oc \
locale-thunar-plugin-media-tags-pa \
locale-thunar-plugin-media-tags-pl \
locale-thunar-plugin-media-tags-pt \
locale-thunar-plugin-media-tags-pt-BR \
locale-thunar-plugin-media-tags-ro \
locale-thunar-plugin-media-tags-ru \
locale-thunar-plugin-media-tags-sk \
locale-thunar-plugin-media-tags-sl \
locale-thunar-plugin-media-tags-sq \
locale-thunar-plugin-media-tags-sr \
locale-thunar-plugin-media-tags-sv \
locale-thunar-plugin-media-tags-th \
locale-thunar-plugin-media-tags-tr \
locale-thunar-plugin-media-tags-ug \
locale-thunar-plugin-media-tags-uk \
locale-thunar-plugin-media-tags-vi \
locale-thunar-plugin-media-tags-zh-CN \
locale-thunar-plugin-media-tags-zh-TW \
thunar-plugin-media-tags-lang \
thunar-plugin-media-tags-lang-all"

RDEPENDS:${PN} += "thunar-plugin-media-tags"

inherit rpm

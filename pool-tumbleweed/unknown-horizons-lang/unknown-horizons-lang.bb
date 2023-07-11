SUMMARY = "Translations for package unknown-horizons"
DESCRIPTION = "Provides translations for the 'unknown-horizons' package."
LICENSE = "APL-1.0 & CC-BY-SA-3.0 & GPL-2.0-with-font-exception & MIT & OFL-1.1"

PV = "2019.1"

RPM_NAME = "unknown-horizons-lang-2019.1-7.7.noarch.rpm"
RPM_HASH = "46d0f567d7eda404fdbd252a9ab0c3a8c2d90a60cd8db64e78cad3a1cd982e11d6728c63f4b05f854f214df6e52b10ab04fc902f4ca9aafe7c661fde67ca0e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-unknown-horizons-af \
locale-unknown-horizons-ar \
locale-unknown-horizons-bg \
locale-unknown-horizons-ca \
locale-unknown-horizons-ca@valencia \
locale-unknown-horizons-cs \
locale-unknown-horizons-da \
locale-unknown-horizons-de \
locale-unknown-horizons-el \
locale-unknown-horizons-eo \
locale-unknown-horizons-es \
locale-unknown-horizons-et \
locale-unknown-horizons-fi \
locale-unknown-horizons-fr \
locale-unknown-horizons-ga \
locale-unknown-horizons-gl \
locale-unknown-horizons-hi \
locale-unknown-horizons-hr \
locale-unknown-horizons-hu \
locale-unknown-horizons-id \
locale-unknown-horizons-it \
locale-unknown-horizons-ja \
locale-unknown-horizons-ko \
locale-unknown-horizons-lt \
locale-unknown-horizons-lv \
locale-unknown-horizons-ml \
locale-unknown-horizons-nb \
locale-unknown-horizons-nl \
locale-unknown-horizons-pl \
locale-unknown-horizons-pt \
locale-unknown-horizons-pt-BR \
locale-unknown-horizons-ro \
locale-unknown-horizons-ru \
locale-unknown-horizons-sk \
locale-unknown-horizons-sl \
locale-unknown-horizons-sr \
locale-unknown-horizons-sv \
locale-unknown-horizons-th \
locale-unknown-horizons-tr \
locale-unknown-horizons-uk \
locale-unknown-horizons-vi \
locale-unknown-horizons-zh-CN \
locale-unknown-horizons-zh-TW \
unknown-horizons-lang \
unknown-horizons-lang-all"

RDEPENDS:${PN} += "unknown-horizons"

inherit rpm

SUMMARY = "Translations for package nemiver"
DESCRIPTION = "Provides translations for the 'nemiver' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-lang-0.9.6-9.9.noarch.rpm"
RPM_HASH = "09c58e1717fb371babb006369a95c2a43ba23f1b9cf3c85c938138b9c74a738251cb63a44365230f3583fc6046f34f708fa746a2e5fbd2a473fa7bfa1a72a4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nemiver-ar \
locale-nemiver-as \
locale-nemiver-bs \
locale-nemiver-ca \
locale-nemiver-ca@valencia \
locale-nemiver-cs \
locale-nemiver-da \
locale-nemiver-de \
locale-nemiver-dz \
locale-nemiver-el \
locale-nemiver-en-GB \
locale-nemiver-eo \
locale-nemiver-es \
locale-nemiver-eu \
locale-nemiver-fi \
locale-nemiver-fr \
locale-nemiver-gl \
locale-nemiver-hi \
locale-nemiver-hu \
locale-nemiver-id \
locale-nemiver-it \
locale-nemiver-ja \
locale-nemiver-ko \
locale-nemiver-lt \
locale-nemiver-lv \
locale-nemiver-ml \
locale-nemiver-nb \
locale-nemiver-nl \
locale-nemiver-oc \
locale-nemiver-pl \
locale-nemiver-pt \
locale-nemiver-pt-BR \
locale-nemiver-ro \
locale-nemiver-ru \
locale-nemiver-sk \
locale-nemiver-sl \
locale-nemiver-sr \
locale-nemiver-sr@latin \
locale-nemiver-sv \
locale-nemiver-th \
locale-nemiver-tr \
locale-nemiver-ug \
locale-nemiver-zh-CN \
locale-nemiver-zh-HK \
locale-nemiver-zh-TW \
nemiver-lang \
nemiver-lang-all"

RDEPENDS:${PN} += "nemiver"

inherit rpm

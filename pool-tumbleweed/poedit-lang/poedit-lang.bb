SUMMARY = "Translations for package poedit"
DESCRIPTION = "Provides translations for the 'poedit' package."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "poedit-lang-3.3.1-1.2.noarch.rpm"
RPM_HASH = "bdd73804837096accd5ecf8bc06c15827b293f19a1335dc213aea1694515433a22753f3291b9c9cc83808bcefec3f7e5494624cf112d06d8e6371d0769a0483a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-poedit-af \
locale-poedit-ar \
locale-poedit-az \
locale-poedit-be \
locale-poedit-be@latin \
locale-poedit-bg \
locale-poedit-bs \
locale-poedit-ca \
locale-poedit-cs \
locale-poedit-da \
locale-poedit-de \
locale-poedit-el \
locale-poedit-en-GB \
locale-poedit-es \
locale-poedit-et \
locale-poedit-eu \
locale-poedit-fa \
locale-poedit-fi \
locale-poedit-fr \
locale-poedit-ga \
locale-poedit-gl \
locale-poedit-he \
locale-poedit-hr \
locale-poedit-hu \
locale-poedit-id \
locale-poedit-is \
locale-poedit-it \
locale-poedit-ja \
locale-poedit-ka \
locale-poedit-kk \
locale-poedit-ko \
locale-poedit-lt \
locale-poedit-lv \
locale-poedit-ms \
locale-poedit-nb \
locale-poedit-nl \
locale-poedit-oc \
locale-poedit-pa \
locale-poedit-pl \
locale-poedit-pt-BR \
locale-poedit-pt-PT \
locale-poedit-ro \
locale-poedit-ru \
locale-poedit-sk \
locale-poedit-sl \
locale-poedit-sq \
locale-poedit-sr \
locale-poedit-sv \
locale-poedit-th \
locale-poedit-tr \
locale-poedit-uk \
locale-poedit-vi \
locale-poedit-zh-CN \
locale-poedit-zh-TW \
poedit-lang \
poedit-lang-all"

RDEPENDS:${PN} += "poedit"

inherit rpm

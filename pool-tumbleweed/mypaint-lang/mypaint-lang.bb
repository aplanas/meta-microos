SUMMARY = "Translations for package mypaint"
DESCRIPTION = "Provides translations for the 'mypaint' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "mypaint-lang-2.0.1-4.1.noarch.rpm"
RPM_HASH = "666f8b53265ee52a7a338cc023df9c08f745c217a0e0b02622825af83ba85f934d8b1ee453af886801971288bd0bbb3ae30280beb843cae95a99349b8ccea59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mypaint-af \
locale-mypaint-ar \
locale-mypaint-as \
locale-mypaint-ast \
locale-mypaint-az \
locale-mypaint-be \
locale-mypaint-bg \
locale-mypaint-bn \
locale-mypaint-br \
locale-mypaint-bs \
locale-mypaint-ca \
locale-mypaint-ca@valencia \
locale-mypaint-cs \
locale-mypaint-da \
locale-mypaint-de \
locale-mypaint-dz \
locale-mypaint-el \
locale-mypaint-en-CA \
locale-mypaint-en-GB \
locale-mypaint-eo \
locale-mypaint-es \
locale-mypaint-et \
locale-mypaint-eu \
locale-mypaint-fa \
locale-mypaint-fi \
locale-mypaint-fr \
locale-mypaint-ga \
locale-mypaint-gl \
locale-mypaint-gu \
locale-mypaint-he \
locale-mypaint-hi \
locale-mypaint-hr \
locale-mypaint-hu \
locale-mypaint-id \
locale-mypaint-is \
locale-mypaint-it \
locale-mypaint-ja \
locale-mypaint-ka \
locale-mypaint-kk \
locale-mypaint-kn \
locale-mypaint-ko \
locale-mypaint-lt \
locale-mypaint-lv \
locale-mypaint-mai \
locale-mypaint-ml \
locale-mypaint-mr \
locale-mypaint-ms \
locale-mypaint-nb \
locale-mypaint-nl \
locale-mypaint-nn-NO \
locale-mypaint-oc \
locale-mypaint-pa \
locale-mypaint-pl \
locale-mypaint-pt \
locale-mypaint-pt-BR \
locale-mypaint-ro \
locale-mypaint-ru \
locale-mypaint-sk \
locale-mypaint-sl \
locale-mypaint-sq \
locale-mypaint-sr \
locale-mypaint-sr@latin \
locale-mypaint-sv \
locale-mypaint-ta \
locale-mypaint-te \
locale-mypaint-th \
locale-mypaint-tr \
locale-mypaint-uk \
locale-mypaint-vi \
locale-mypaint-wa \
locale-mypaint-zh-CN \
locale-mypaint-zh-HK \
locale-mypaint-zh-TW \
mypaint-lang \
mypaint-lang-all"

RDEPENDS:${PN} += "mypaint"

inherit rpm

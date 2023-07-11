SUMMARY = "Translations for package glib-networking"
DESCRIPTION = "Provides translations for the 'glib-networking' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.1"

RPM_NAME = "glib-networking-lang-2.76.1-1.1.noarch.rpm"
RPM_HASH = "dd218e4d50b20a085b075b65b5e1232c139808258046a3c9d90e921e2c45e8253caaee6b348cb129d54050389eb1e47383caeffcddaf774ee307b43be6fd343b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glib-networking-lang \
glib-networking-lang-all \
locale-glib-networking-ar \
locale-glib-networking-as \
locale-glib-networking-be \
locale-glib-networking-bg \
locale-glib-networking-bn-IN \
locale-glib-networking-bs \
locale-glib-networking-ca \
locale-glib-networking-ca@valencia \
locale-glib-networking-cs \
locale-glib-networking-da \
locale-glib-networking-de \
locale-glib-networking-el \
locale-glib-networking-en-CA \
locale-glib-networking-en-GB \
locale-glib-networking-eo \
locale-glib-networking-es \
locale-glib-networking-et \
locale-glib-networking-eu \
locale-glib-networking-fa \
locale-glib-networking-fi \
locale-glib-networking-fr \
locale-glib-networking-fur \
locale-glib-networking-gd \
locale-glib-networking-gl \
locale-glib-networking-gu \
locale-glib-networking-he \
locale-glib-networking-hi \
locale-glib-networking-hr \
locale-glib-networking-hu \
locale-glib-networking-id \
locale-glib-networking-it \
locale-glib-networking-ja \
locale-glib-networking-ka \
locale-glib-networking-kk \
locale-glib-networking-km \
locale-glib-networking-kn \
locale-glib-networking-ko \
locale-glib-networking-lt \
locale-glib-networking-lv \
locale-glib-networking-ml \
locale-glib-networking-mr \
locale-glib-networking-ms \
locale-glib-networking-nb \
locale-glib-networking-ne \
locale-glib-networking-nl \
locale-glib-networking-oc \
locale-glib-networking-or \
locale-glib-networking-pa \
locale-glib-networking-pl \
locale-glib-networking-pt \
locale-glib-networking-pt-BR \
locale-glib-networking-ro \
locale-glib-networking-ru \
locale-glib-networking-sk \
locale-glib-networking-sl \
locale-glib-networking-sr \
locale-glib-networking-sr@latin \
locale-glib-networking-sv \
locale-glib-networking-ta \
locale-glib-networking-te \
locale-glib-networking-th \
locale-glib-networking-tr \
locale-glib-networking-ug \
locale-glib-networking-uk \
locale-glib-networking-vi \
locale-glib-networking-zh-CN \
locale-glib-networking-zh-HK \
locale-glib-networking-zh-TW"

RDEPENDS:${PN} += "glib-networking"

inherit rpm

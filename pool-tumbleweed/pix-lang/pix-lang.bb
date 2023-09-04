SUMMARY = "Translations for package pix"
DESCRIPTION = "Provides translations for the 'pix' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "pix-lang-3.0.2-1.1.noarch.rpm"
RPM_HASH = "ff1bf9c81b35bb2a90512a6dc2dc85d82f2e8a8f90b2676332735529fdb378625ed95458ee0f31df7d6cb90ad95fc37d44135fb66216610b6c9570632d898416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pix-af \
locale-pix-ar \
locale-pix-az \
locale-pix-be \
locale-pix-bg \
locale-pix-bn \
locale-pix-ca \
locale-pix-ca@valencia \
locale-pix-cs \
locale-pix-cy \
locale-pix-da \
locale-pix-de \
locale-pix-dz \
locale-pix-el \
locale-pix-en-CA \
locale-pix-en-GB \
locale-pix-eo \
locale-pix-es \
locale-pix-et \
locale-pix-eu \
locale-pix-fa \
locale-pix-fi \
locale-pix-fr \
locale-pix-fr-CA \
locale-pix-ga \
locale-pix-gl \
locale-pix-gu \
locale-pix-he \
locale-pix-hi \
locale-pix-hr \
locale-pix-hu \
locale-pix-ia \
locale-pix-id \
locale-pix-is \
locale-pix-it \
locale-pix-ja \
locale-pix-kk \
locale-pix-kn \
locale-pix-ko \
locale-pix-lt \
locale-pix-lv \
locale-pix-mk \
locale-pix-ml \
locale-pix-mr \
locale-pix-ms \
locale-pix-nb \
locale-pix-nds \
locale-pix-ne \
locale-pix-nl \
locale-pix-nn \
locale-pix-oc \
locale-pix-pa \
locale-pix-pl \
locale-pix-pt \
locale-pix-pt-BR \
locale-pix-ro \
locale-pix-ru \
locale-pix-sk \
locale-pix-sl \
locale-pix-sq \
locale-pix-sr \
locale-pix-sr@latin \
locale-pix-sv \
locale-pix-ta \
locale-pix-th \
locale-pix-tr \
locale-pix-uk \
locale-pix-vi \
locale-pix-zh-CN \
locale-pix-zh-HK \
locale-pix-zh-TW \
pix-lang \
pix-lang-all"

RDEPENDS:${PN} += "pix"

inherit rpm

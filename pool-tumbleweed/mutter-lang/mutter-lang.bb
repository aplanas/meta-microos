SUMMARY = "Translations for package mutter"
DESCRIPTION = "Provides translations for the 'mutter' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "mutter-lang-44.3-1.1.noarch.rpm"
RPM_HASH = "5db9c788cc50d41678be5e459c33416b905d2c9d67f440aa5b50ade56b80b5a524b79e3727b7badd1966e089f0ac6022ca5a9abb7ada41b9764447ba9a62c025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mutter-ar \
locale-mutter-as \
locale-mutter-ast \
locale-mutter-az \
locale-mutter-be \
locale-mutter-be@latin \
locale-mutter-bg \
locale-mutter-bn \
locale-mutter-bn-IN \
locale-mutter-br \
locale-mutter-bs \
locale-mutter-ca \
locale-mutter-ca@valencia \
locale-mutter-cs \
locale-mutter-cy \
locale-mutter-da \
locale-mutter-de \
locale-mutter-dz \
locale-mutter-el \
locale-mutter-en-CA \
locale-mutter-en-GB \
locale-mutter-eo \
locale-mutter-es \
locale-mutter-et \
locale-mutter-eu \
locale-mutter-fa \
locale-mutter-fi \
locale-mutter-fr \
locale-mutter-fur \
locale-mutter-ga \
locale-mutter-gd \
locale-mutter-gl \
locale-mutter-gu \
locale-mutter-he \
locale-mutter-hi \
locale-mutter-hr \
locale-mutter-hu \
locale-mutter-id \
locale-mutter-is \
locale-mutter-it \
locale-mutter-ja \
locale-mutter-ka \
locale-mutter-kk \
locale-mutter-kn \
locale-mutter-ko \
locale-mutter-lt \
locale-mutter-lv \
locale-mutter-mai \
locale-mutter-mk \
locale-mutter-ml \
locale-mutter-mr \
locale-mutter-ms \
locale-mutter-nb \
locale-mutter-nds \
locale-mutter-ne \
locale-mutter-nl \
locale-mutter-nn \
locale-mutter-oc \
locale-mutter-or \
locale-mutter-pa \
locale-mutter-pl \
locale-mutter-pt \
locale-mutter-pt-BR \
locale-mutter-ro \
locale-mutter-ru \
locale-mutter-si \
locale-mutter-sk \
locale-mutter-sl \
locale-mutter-sq \
locale-mutter-sr \
locale-mutter-sr@latin \
locale-mutter-sv \
locale-mutter-ta \
locale-mutter-te \
locale-mutter-th \
locale-mutter-tr \
locale-mutter-ug \
locale-mutter-uk \
locale-mutter-vi \
locale-mutter-wa \
locale-mutter-zh-CN \
locale-mutter-zh-HK \
locale-mutter-zh-TW \
mutter-lang \
mutter-lang-all"

RDEPENDS:${PN} += "mutter"

inherit rpm

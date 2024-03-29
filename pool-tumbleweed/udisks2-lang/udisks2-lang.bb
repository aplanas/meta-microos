SUMMARY = "Translations for package udisks2"
DESCRIPTION = "Provides translations for the 'udisks2' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-lang-2.9.4-6.4.noarch.rpm"
RPM_HASH = "3b8c990b26eafa5e2ed50cb1f9f06ab1e5b332be9c667185415a9e04429a5c0b6185ab581862b0d5be3a0d8effd4657b2095629f52e2236a8bd4355a0a857585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-udisks2-af \
locale-udisks2-ar \
locale-udisks2-as \
locale-udisks2-az \
locale-udisks2-bg \
locale-udisks2-bn-IN \
locale-udisks2-ca \
locale-udisks2-ca@valencia \
locale-udisks2-cs \
locale-udisks2-cy \
locale-udisks2-da \
locale-udisks2-de \
locale-udisks2-el \
locale-udisks2-en-GB \
locale-udisks2-eo \
locale-udisks2-es \
locale-udisks2-et \
locale-udisks2-eu \
locale-udisks2-fa \
locale-udisks2-fi \
locale-udisks2-fr \
locale-udisks2-fur \
locale-udisks2-ga \
locale-udisks2-gl \
locale-udisks2-gu \
locale-udisks2-he \
locale-udisks2-hi \
locale-udisks2-hr \
locale-udisks2-hu \
locale-udisks2-ia \
locale-udisks2-id \
locale-udisks2-it \
locale-udisks2-ja \
locale-udisks2-ka \
locale-udisks2-kk \
locale-udisks2-kn \
locale-udisks2-ko \
locale-udisks2-lt \
locale-udisks2-lv \
locale-udisks2-ml \
locale-udisks2-mr \
locale-udisks2-ms \
locale-udisks2-nb \
locale-udisks2-nl \
locale-udisks2-nn \
locale-udisks2-oc \
locale-udisks2-or \
locale-udisks2-pa \
locale-udisks2-pl \
locale-udisks2-pt \
locale-udisks2-pt-BR \
locale-udisks2-ro \
locale-udisks2-ru \
locale-udisks2-sk \
locale-udisks2-sl \
locale-udisks2-sq \
locale-udisks2-sr \
locale-udisks2-sr@latin \
locale-udisks2-sv \
locale-udisks2-ta \
locale-udisks2-te \
locale-udisks2-th \
locale-udisks2-tr \
locale-udisks2-uk \
locale-udisks2-vi \
locale-udisks2-wa \
locale-udisks2-zh-CN \
locale-udisks2-zh-HK \
locale-udisks2-zh-TW \
udisks2-lang \
udisks2-lang-all"

RDEPENDS:${PN} += "udisks2"

inherit rpm

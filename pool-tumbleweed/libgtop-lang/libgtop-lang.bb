SUMMARY = "Translations for package libgtop"
DESCRIPTION = "Provides translations for the 'libgtop' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-lang-2.40.0-4.4.noarch.rpm"
RPM_HASH = "8f23724d180c352d5ee622c36d2337a6aafcc01cb9670464d3cea9029e722250471cb30d26cb971b0ed237e74878bf8fea3dd03cf2a02fe0f6bc1ee0a075e861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgtop-lang \
libgtop-lang-all \
locale-libgtop-ar \
locale-libgtop-as \
locale-libgtop-ast \
locale-libgtop-az \
locale-libgtop-be \
locale-libgtop-bg \
locale-libgtop-bn \
locale-libgtop-bn-IN \
locale-libgtop-bs \
locale-libgtop-ca \
locale-libgtop-ca@valencia \
locale-libgtop-cs \
locale-libgtop-cy \
locale-libgtop-da \
locale-libgtop-de \
locale-libgtop-dz \
locale-libgtop-el \
locale-libgtop-en-CA \
locale-libgtop-en-GB \
locale-libgtop-en@shaw \
locale-libgtop-eo \
locale-libgtop-es \
locale-libgtop-et \
locale-libgtop-eu \
locale-libgtop-fa \
locale-libgtop-fi \
locale-libgtop-fr \
locale-libgtop-fur \
locale-libgtop-ga \
locale-libgtop-gl \
locale-libgtop-gu \
locale-libgtop-he \
locale-libgtop-hi \
locale-libgtop-hr \
locale-libgtop-hu \
locale-libgtop-id \
locale-libgtop-it \
locale-libgtop-ja \
locale-libgtop-ka \
locale-libgtop-kn \
locale-libgtop-ko \
locale-libgtop-lt \
locale-libgtop-lv \
locale-libgtop-mai \
locale-libgtop-mk \
locale-libgtop-ml \
locale-libgtop-mr \
locale-libgtop-ms \
locale-libgtop-nb \
locale-libgtop-ne \
locale-libgtop-nl \
locale-libgtop-nn \
locale-libgtop-oc \
locale-libgtop-or \
locale-libgtop-pa \
locale-libgtop-pl \
locale-libgtop-pt \
locale-libgtop-pt-BR \
locale-libgtop-ro \
locale-libgtop-ru \
locale-libgtop-sk \
locale-libgtop-sl \
locale-libgtop-sq \
locale-libgtop-sr \
locale-libgtop-sr@latin \
locale-libgtop-sv \
locale-libgtop-ta \
locale-libgtop-te \
locale-libgtop-th \
locale-libgtop-tr \
locale-libgtop-ug \
locale-libgtop-uk \
locale-libgtop-vi \
locale-libgtop-zh-CN \
locale-libgtop-zh-HK \
locale-libgtop-zh-TW"

RDEPENDS:${PN} += "libgtop"

inherit rpm

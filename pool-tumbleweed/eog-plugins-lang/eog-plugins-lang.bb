SUMMARY = "Translations for package eog-plugins"
DESCRIPTION = "Provides translations for the 'eog-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-lang-44.0-1.2.noarch.rpm"
RPM_HASH = "4424e95b7bc6472ef76f33d11fb1f0da6b4722b6299825cc7981ad4822e1745687a0d06f8d9bc93c9e9e119352f072ba495b42300fc2b3ba85d23bba8ae3880b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-plugins-lang \
eog-plugins-lang-all \
locale-eog-plugins-ar \
locale-eog-plugins-as \
locale-eog-plugins-be \
locale-eog-plugins-be@latin \
locale-eog-plugins-bg \
locale-eog-plugins-bn-IN \
locale-eog-plugins-bs \
locale-eog-plugins-ca \
locale-eog-plugins-ca@valencia \
locale-eog-plugins-cs \
locale-eog-plugins-da \
locale-eog-plugins-de \
locale-eog-plugins-el \
locale-eog-plugins-en-GB \
locale-eog-plugins-es \
locale-eog-plugins-eu \
locale-eog-plugins-fi \
locale-eog-plugins-fr \
locale-eog-plugins-fur \
locale-eog-plugins-gl \
locale-eog-plugins-gu \
locale-eog-plugins-he \
locale-eog-plugins-hr \
locale-eog-plugins-hu \
locale-eog-plugins-id \
locale-eog-plugins-is \
locale-eog-plugins-it \
locale-eog-plugins-ja \
locale-eog-plugins-ka \
locale-eog-plugins-kn \
locale-eog-plugins-ko \
locale-eog-plugins-lt \
locale-eog-plugins-lv \
locale-eog-plugins-mk \
locale-eog-plugins-ml \
locale-eog-plugins-mr \
locale-eog-plugins-nb \
locale-eog-plugins-nl \
locale-eog-plugins-oc \
locale-eog-plugins-or \
locale-eog-plugins-pa \
locale-eog-plugins-pl \
locale-eog-plugins-pt \
locale-eog-plugins-pt-BR \
locale-eog-plugins-ro \
locale-eog-plugins-ru \
locale-eog-plugins-sk \
locale-eog-plugins-sl \
locale-eog-plugins-sq \
locale-eog-plugins-sr \
locale-eog-plugins-sr@latin \
locale-eog-plugins-sv \
locale-eog-plugins-ta \
locale-eog-plugins-te \
locale-eog-plugins-tr \
locale-eog-plugins-uk \
locale-eog-plugins-vi \
locale-eog-plugins-zh-CN \
locale-eog-plugins-zh-HK \
locale-eog-plugins-zh-TW"

RDEPENDS:${PN} += "eog-plugins"

inherit rpm

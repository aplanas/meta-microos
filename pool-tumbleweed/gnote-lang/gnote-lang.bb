SUMMARY = "Translations for package gnote"
DESCRIPTION = "Provides translations for the 'gnote' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnote-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "f0b7278e1bf2d344f6c569c3ca7e6e469f421adaa3d965de592c280bc6a19fc60f147b5fc92b03480a356fbf32d76a7a7039d864b604157c45155a50b527572b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnote-lang \
gnote-lang-all \
locale-gnote-ar \
locale-gnote-as \
locale-gnote-bg \
locale-gnote-bn-IN \
locale-gnote-bs \
locale-gnote-ca \
locale-gnote-ca@valencia \
locale-gnote-cs \
locale-gnote-da \
locale-gnote-de \
locale-gnote-el \
locale-gnote-en-GB \
locale-gnote-eo \
locale-gnote-es \
locale-gnote-eu \
locale-gnote-fi \
locale-gnote-fr \
locale-gnote-gl \
locale-gnote-gu \
locale-gnote-he \
locale-gnote-hi \
locale-gnote-hu \
locale-gnote-id \
locale-gnote-it \
locale-gnote-ja \
locale-gnote-kn \
locale-gnote-ko \
locale-gnote-lt \
locale-gnote-lv \
locale-gnote-ml \
locale-gnote-mr \
locale-gnote-nb \
locale-gnote-nl \
locale-gnote-oc \
locale-gnote-or \
locale-gnote-pa \
locale-gnote-pl \
locale-gnote-pt \
locale-gnote-pt-BR \
locale-gnote-ro \
locale-gnote-ru \
locale-gnote-sk \
locale-gnote-sl \
locale-gnote-sr \
locale-gnote-sr@latin \
locale-gnote-sv \
locale-gnote-ta \
locale-gnote-te \
locale-gnote-th \
locale-gnote-tr \
locale-gnote-uk \
locale-gnote-zh-CN \
locale-gnote-zh-HK \
locale-gnote-zh-TW"

RDEPENDS:${PN} += "gnote"

inherit rpm

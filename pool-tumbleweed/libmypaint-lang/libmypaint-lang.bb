SUMMARY = "Translations for package libmypaint"
DESCRIPTION = "Provides translations for the 'libmypaint' package."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-lang-1.6.1-2.4.noarch.rpm"
RPM_HASH = "2dc36e6474d8d1f5e74b7842b3dcfc98e3ca6572d4713370b82c3b0340c5372c242ae16820c56dfb6ca316e3f8f53e9c7f48d9a4af506791e84b2ab25fb7c9a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmypaint-lang \
libmypaint-lang-all \
locale-libmypaint-af \
locale-libmypaint-ar \
locale-libmypaint-as \
locale-libmypaint-ast \
locale-libmypaint-az \
locale-libmypaint-be \
locale-libmypaint-bg \
locale-libmypaint-bn \
locale-libmypaint-br \
locale-libmypaint-bs \
locale-libmypaint-ca \
locale-libmypaint-ca@valencia \
locale-libmypaint-cs \
locale-libmypaint-da \
locale-libmypaint-de \
locale-libmypaint-dz \
locale-libmypaint-el \
locale-libmypaint-en-CA \
locale-libmypaint-en-GB \
locale-libmypaint-eo \
locale-libmypaint-es \
locale-libmypaint-et \
locale-libmypaint-eu \
locale-libmypaint-fa \
locale-libmypaint-fi \
locale-libmypaint-fr \
locale-libmypaint-ga \
locale-libmypaint-gl \
locale-libmypaint-gu \
locale-libmypaint-he \
locale-libmypaint-hi \
locale-libmypaint-hr \
locale-libmypaint-hu \
locale-libmypaint-id \
locale-libmypaint-is \
locale-libmypaint-it \
locale-libmypaint-ja \
locale-libmypaint-ka \
locale-libmypaint-kk \
locale-libmypaint-kn \
locale-libmypaint-ko \
locale-libmypaint-lt \
locale-libmypaint-lv \
locale-libmypaint-mai \
locale-libmypaint-mr \
locale-libmypaint-ms \
locale-libmypaint-nb \
locale-libmypaint-nl \
locale-libmypaint-nn-NO \
locale-libmypaint-oc \
locale-libmypaint-pa \
locale-libmypaint-pl \
locale-libmypaint-pt \
locale-libmypaint-pt-BR \
locale-libmypaint-ro \
locale-libmypaint-ru \
locale-libmypaint-sk \
locale-libmypaint-sl \
locale-libmypaint-sq \
locale-libmypaint-sr \
locale-libmypaint-sr@latin \
locale-libmypaint-sv \
locale-libmypaint-ta \
locale-libmypaint-te \
locale-libmypaint-th \
locale-libmypaint-tr \
locale-libmypaint-uk \
locale-libmypaint-vi \
locale-libmypaint-wa \
locale-libmypaint-zh-CN \
locale-libmypaint-zh-HK \
locale-libmypaint-zh-TW"

RDEPENDS:${PN} += "libmypaint"

inherit rpm

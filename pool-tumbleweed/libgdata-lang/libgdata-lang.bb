SUMMARY = "Translations for package libgdata"
DESCRIPTION = "Provides translations for the 'libgdata' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata-lang-0.18.1-3.4.noarch.rpm"
RPM_HASH = "7f58f8709f2f6ba955e085c6439bfc8d357bee74a133a8f06396c00e8cee105bd1b3835edab30ea8be4aab78a435ffa6ac7f8e4f26ea62c7f61c11995bfdb8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgdata-lang \
libgdata-lang-all \
locale-libgdata-ar \
locale-libgdata-as \
locale-libgdata-be \
locale-libgdata-bg \
locale-libgdata-bn-IN \
locale-libgdata-bs \
locale-libgdata-ca \
locale-libgdata-ca@valencia \
locale-libgdata-cs \
locale-libgdata-da \
locale-libgdata-de \
locale-libgdata-el \
locale-libgdata-en-GB \
locale-libgdata-eo \
locale-libgdata-es \
locale-libgdata-et \
locale-libgdata-eu \
locale-libgdata-fi \
locale-libgdata-fr \
locale-libgdata-fur \
locale-libgdata-gl \
locale-libgdata-gu \
locale-libgdata-he \
locale-libgdata-hi \
locale-libgdata-hr \
locale-libgdata-hu \
locale-libgdata-id \
locale-libgdata-it \
locale-libgdata-ja \
locale-libgdata-kn \
locale-libgdata-ko \
locale-libgdata-lt \
locale-libgdata-lv \
locale-libgdata-ml \
locale-libgdata-mr \
locale-libgdata-ms \
locale-libgdata-nb \
locale-libgdata-ne \
locale-libgdata-nl \
locale-libgdata-oc \
locale-libgdata-or \
locale-libgdata-pa \
locale-libgdata-pl \
locale-libgdata-pt \
locale-libgdata-pt-BR \
locale-libgdata-ro \
locale-libgdata-ru \
locale-libgdata-sk \
locale-libgdata-sl \
locale-libgdata-sr \
locale-libgdata-sr@latin \
locale-libgdata-sv \
locale-libgdata-ta \
locale-libgdata-te \
locale-libgdata-th \
locale-libgdata-tr \
locale-libgdata-ug \
locale-libgdata-uk \
locale-libgdata-vi \
locale-libgdata-zh-CN \
locale-libgdata-zh-HK \
locale-libgdata-zh-TW"

RDEPENDS:${PN} += "libgdata"

inherit rpm

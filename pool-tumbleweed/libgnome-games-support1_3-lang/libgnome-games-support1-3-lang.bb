SUMMARY = "Translations for package libgnome-games-support1_3"
DESCRIPTION = "Provides translations for the 'libgnome-games-support1_3' package."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support1_3-lang-1.8.2-1.8.noarch.rpm"
RPM_HASH = "8dd3c26577a9bf64ba346325077753cf1bc82ec6433eade45e3b71cf899a45d99f50d8898f0959729134513ed6fd6b31c079fc522e6af42703f5d410a2401360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnome-games-support1-3-lang \
libgnome-games-support1-3-lang-all \
locale-libgnome-games-support1-3-af \
locale-libgnome-games-support1-3-ar \
locale-libgnome-games-support1-3-be \
locale-libgnome-games-support1-3-bg \
locale-libgnome-games-support1-3-ca \
locale-libgnome-games-support1-3-ca@valencia \
locale-libgnome-games-support1-3-cs \
locale-libgnome-games-support1-3-da \
locale-libgnome-games-support1-3-de \
locale-libgnome-games-support1-3-el \
locale-libgnome-games-support1-3-en-GB \
locale-libgnome-games-support1-3-eo \
locale-libgnome-games-support1-3-es \
locale-libgnome-games-support1-3-eu \
locale-libgnome-games-support1-3-fa \
locale-libgnome-games-support1-3-fi \
locale-libgnome-games-support1-3-fr \
locale-libgnome-games-support1-3-fur \
locale-libgnome-games-support1-3-gl \
locale-libgnome-games-support1-3-he \
locale-libgnome-games-support1-3-hr \
locale-libgnome-games-support1-3-hu \
locale-libgnome-games-support1-3-id \
locale-libgnome-games-support1-3-is \
locale-libgnome-games-support1-3-it \
locale-libgnome-games-support1-3-ja \
locale-libgnome-games-support1-3-kk \
locale-libgnome-games-support1-3-ko \
locale-libgnome-games-support1-3-lt \
locale-libgnome-games-support1-3-lv \
locale-libgnome-games-support1-3-ml \
locale-libgnome-games-support1-3-ms \
locale-libgnome-games-support1-3-nb \
locale-libgnome-games-support1-3-ne \
locale-libgnome-games-support1-3-nl \
locale-libgnome-games-support1-3-oc \
locale-libgnome-games-support1-3-pa \
locale-libgnome-games-support1-3-pl \
locale-libgnome-games-support1-3-pt \
locale-libgnome-games-support1-3-pt-BR \
locale-libgnome-games-support1-3-ro \
locale-libgnome-games-support1-3-ru \
locale-libgnome-games-support1-3-sk \
locale-libgnome-games-support1-3-sl \
locale-libgnome-games-support1-3-sr \
locale-libgnome-games-support1-3-sr@latin \
locale-libgnome-games-support1-3-sv \
locale-libgnome-games-support1-3-ta \
locale-libgnome-games-support1-3-tr \
locale-libgnome-games-support1-3-uk \
locale-libgnome-games-support1-3-zh-CN \
locale-libgnome-games-support1-3-zh-TW"

RDEPENDS:${PN} += "libgnome-games-support1-3"

inherit rpm

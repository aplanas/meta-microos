SUMMARY = "Translations for package libgnome-games-support"
DESCRIPTION = "Provides translations for the 'libgnome-games-support' package."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgnome-games-support-lang-2.0.0-1.7.noarch.rpm"
RPM_HASH = "c0dbbdb3aea4ec64087f433ed3d29d325410a26b5f66cd0a7bf3e23e091f1083d43b94b52e85a0c728a40bf4262c6d6f7fc6ae0de7f2ecadacad381b71559d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnome-games-support-lang \
libgnome-games-support-lang-all \
locale-libgnome-games-support-af \
locale-libgnome-games-support-ar \
locale-libgnome-games-support-be \
locale-libgnome-games-support-bg \
locale-libgnome-games-support-ca \
locale-libgnome-games-support-ca@valencia \
locale-libgnome-games-support-cs \
locale-libgnome-games-support-da \
locale-libgnome-games-support-de \
locale-libgnome-games-support-el \
locale-libgnome-games-support-en-GB \
locale-libgnome-games-support-eo \
locale-libgnome-games-support-es \
locale-libgnome-games-support-eu \
locale-libgnome-games-support-fa \
locale-libgnome-games-support-fi \
locale-libgnome-games-support-fr \
locale-libgnome-games-support-fur \
locale-libgnome-games-support-gl \
locale-libgnome-games-support-he \
locale-libgnome-games-support-hr \
locale-libgnome-games-support-hu \
locale-libgnome-games-support-id \
locale-libgnome-games-support-is \
locale-libgnome-games-support-it \
locale-libgnome-games-support-ja \
locale-libgnome-games-support-kk \
locale-libgnome-games-support-ko \
locale-libgnome-games-support-lt \
locale-libgnome-games-support-lv \
locale-libgnome-games-support-ml \
locale-libgnome-games-support-ms \
locale-libgnome-games-support-nb \
locale-libgnome-games-support-ne \
locale-libgnome-games-support-nl \
locale-libgnome-games-support-oc \
locale-libgnome-games-support-pa \
locale-libgnome-games-support-pl \
locale-libgnome-games-support-pt \
locale-libgnome-games-support-pt-BR \
locale-libgnome-games-support-ro \
locale-libgnome-games-support-ru \
locale-libgnome-games-support-sk \
locale-libgnome-games-support-sl \
locale-libgnome-games-support-sr \
locale-libgnome-games-support-sr@latin \
locale-libgnome-games-support-sv \
locale-libgnome-games-support-ta \
locale-libgnome-games-support-tr \
locale-libgnome-games-support-uk \
locale-libgnome-games-support-zh-CN \
locale-libgnome-games-support-zh-TW"

RDEPENDS:${PN} += "libgnome-games-support"

inherit rpm

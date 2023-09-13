SUMMARY = "Translations for package libgphoto2-6"
DESCRIPTION = "Provides translations for the 'libgphoto2-6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.31"

RPM_NAME = "libgphoto2-6-lang-2.5.31-1.1.noarch.rpm"
RPM_HASH = "7b7690d7f0f2ad685f691a54eab2bab20fb9dd83f9e192af78b67a3ba338a321e1f3c99dcaa89a2153e09732251ad52a1467c07d8f8f628e2061e3b1ca79c981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-6-lang \
libgphoto2-6-lang-all \
locale-libgphoto2-6-cs \
locale-libgphoto2-6-da \
locale-libgphoto2-6-de \
locale-libgphoto2-6-es \
locale-libgphoto2-6-eu \
locale-libgphoto2-6-fi \
locale-libgphoto2-6-fr \
locale-libgphoto2-6-hu \
locale-libgphoto2-6-it \
locale-libgphoto2-6-ja \
locale-libgphoto2-6-nl \
locale-libgphoto2-6-pl \
locale-libgphoto2-6-pt-BR \
locale-libgphoto2-6-ro \
locale-libgphoto2-6-ru \
locale-libgphoto2-6-sk \
locale-libgphoto2-6-sr \
locale-libgphoto2-6-sv \
locale-libgphoto2-6-uk \
locale-libgphoto2-6-vi \
locale-libgphoto2-6-zh-CN \
locale-libgphoto2-6-zh-TW"

RDEPENDS:${PN} += "libgphoto2-6"

inherit rpm

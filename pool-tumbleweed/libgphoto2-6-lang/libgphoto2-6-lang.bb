SUMMARY = "Translations for package libgphoto2-6"
DESCRIPTION = "Provides translations for the 'libgphoto2-6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-6-lang-2.5.30-3.1.noarch.rpm"
RPM_HASH = "a66cfea1caf0d33526ae648ec0572d4684e3fb97558a42b562f82ca8329f630c6e7424580021000b6441c416802b613e59f8921979bd4841312fb8c1f73d4ad1"
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

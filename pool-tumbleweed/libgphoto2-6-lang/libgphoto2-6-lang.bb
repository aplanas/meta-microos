SUMMARY = "Translations for package libgphoto2-6"
DESCRIPTION = "Provides translations for the 'libgphoto2-6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-6-lang-2.5.30-2.2.noarch.rpm"
RPM_HASH = "7673a933dd509a0e8389884fe1941544efd26ce81653220ceb3b5ce9bd577df0bb06dd82d93e9e35606c54e45a7144376530019ea742e33457a9ff89f7896cc5"
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

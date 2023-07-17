SUMMARY = "Translations for package minicom"
DESCRIPTION = "Provides translations for the 'minicom' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-lang-2.8-2.1.noarch.rpm"
RPM_HASH = "f752ec3be15bd4ebd87497e0f3f3f5ba7a3de37d0565ed24fd4173712c86f8b48dbdca90845d32eb8991deb587f56df9ec70135e987c95a73b3fbfa7fbf963bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minicom-cs \
locale-minicom-da \
locale-minicom-de \
locale-minicom-es \
locale-minicom-fi \
locale-minicom-fr \
locale-minicom-hu \
locale-minicom-id \
locale-minicom-ja \
locale-minicom-nb \
locale-minicom-pl \
locale-minicom-pt-BR \
locale-minicom-ro \
locale-minicom-ru \
locale-minicom-sr \
locale-minicom-sv \
locale-minicom-vi \
locale-minicom-zh-CN \
locale-minicom-zh-TW \
minicom-lang \
minicom-lang-all"

RDEPENDS:${PN} += "minicom"

inherit rpm

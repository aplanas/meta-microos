SUMMARY = "Translations for package make"
DESCRIPTION = "Provides translations for the 'make' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-lang-4.4.1-2.1.noarch.rpm"
RPM_HASH = "9e09acb910c44e7dfd2325151801f061552df6ffebb1d2cc9a3bd26d51b75482db7b43c5a0ef22737f7c8ea5a871592d84134985ef193f1fe7f6315153243adb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-make-be \
locale-make-bg \
locale-make-cs \
locale-make-da \
locale-make-de \
locale-make-es \
locale-make-fi \
locale-make-fr \
locale-make-ga \
locale-make-gl \
locale-make-he \
locale-make-hr \
locale-make-id \
locale-make-it \
locale-make-ja \
locale-make-ko \
locale-make-lt \
locale-make-nl \
locale-make-pl \
locale-make-pt \
locale-make-pt-BR \
locale-make-ro \
locale-make-ru \
locale-make-sr \
locale-make-sv \
locale-make-tr \
locale-make-uk \
locale-make-vi \
locale-make-zh-CN \
locale-make-zh-TW \
make-lang \
make-lang-all"

RDEPENDS:${PN} += "make"

inherit rpm

SUMMARY = "Translations for package make"
DESCRIPTION = "Provides translations for the 'make' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-lang-4.4.1-2.3.noarch.rpm"
RPM_HASH = "46a4c7baae91786948e982acfc0e69b09422680689d821f15a50fc7ffebbc58f43b651abd6a1b5fad9bcc6b1b64619d9a2b0a54ea0d1ffd6e549b9b7200154c2"
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

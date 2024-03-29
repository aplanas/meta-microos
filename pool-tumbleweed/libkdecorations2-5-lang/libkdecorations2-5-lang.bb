SUMMARY = "Translations for package libkdecorations2-5"
DESCRIPTION = "Provides translations for the 'libkdecorations2-5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkdecorations2-5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "1a3d4d574cc6778f079970ed5d17c004fbcb69837a35ac0b77624f8f7415397ed68a20bc12737eb3550352beaf064af389c556d8a4b83a84aea6cb377c8839cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdecorations2-5-lang \
libkdecorations2-5-lang-all \
locale-libkdecorations2-5-az \
locale-libkdecorations2-5-bg \
locale-libkdecorations2-5-ca \
locale-libkdecorations2-5-ca@valencia \
locale-libkdecorations2-5-cs \
locale-libkdecorations2-5-da \
locale-libkdecorations2-5-de \
locale-libkdecorations2-5-el \
locale-libkdecorations2-5-en-GB \
locale-libkdecorations2-5-es \
locale-libkdecorations2-5-et \
locale-libkdecorations2-5-eu \
locale-libkdecorations2-5-fi \
locale-libkdecorations2-5-fr \
locale-libkdecorations2-5-gl \
locale-libkdecorations2-5-hi \
locale-libkdecorations2-5-hu \
locale-libkdecorations2-5-ia \
locale-libkdecorations2-5-id \
locale-libkdecorations2-5-it \
locale-libkdecorations2-5-ja \
locale-libkdecorations2-5-ka \
locale-libkdecorations2-5-ko \
locale-libkdecorations2-5-lt \
locale-libkdecorations2-5-ml \
locale-libkdecorations2-5-nl \
locale-libkdecorations2-5-nn \
locale-libkdecorations2-5-pl \
locale-libkdecorations2-5-pt \
locale-libkdecorations2-5-pt-BR \
locale-libkdecorations2-5-ro \
locale-libkdecorations2-5-ru \
locale-libkdecorations2-5-sk \
locale-libkdecorations2-5-sl \
locale-libkdecorations2-5-sv \
locale-libkdecorations2-5-tr \
locale-libkdecorations2-5-uk \
locale-libkdecorations2-5-zh-CN \
locale-libkdecorations2-5-zh-TW"

RDEPENDS:${PN} += "libkdecorations2-5"

inherit rpm

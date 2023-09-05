SUMMARY = "Translations for package libkomparediff2"
DESCRIPTION = "Provides translations for the 'libkomparediff2' package."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.08.0"

RPM_NAME = "libkomparediff2-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e108976c1df5726b13e06ab768ed53f4837008028a9bf32c14a2d6ce66dd25066af37bb8deaebe8c57de2c8e23c5a58ce55d90f79c265336b0a68f5f722f5e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkomparediff2-lang \
libkomparediff2-lang-all \
locale-libkomparediff2-af \
locale-libkomparediff2-ar \
locale-libkomparediff2-be \
locale-libkomparediff2-bg \
locale-libkomparediff2-br \
locale-libkomparediff2-bs \
locale-libkomparediff2-ca \
locale-libkomparediff2-ca@valencia \
locale-libkomparediff2-cs \
locale-libkomparediff2-cy \
locale-libkomparediff2-da \
locale-libkomparediff2-de \
locale-libkomparediff2-el \
locale-libkomparediff2-en-GB \
locale-libkomparediff2-eo \
locale-libkomparediff2-es \
locale-libkomparediff2-et \
locale-libkomparediff2-eu \
locale-libkomparediff2-fa \
locale-libkomparediff2-fi \
locale-libkomparediff2-fr \
locale-libkomparediff2-ga \
locale-libkomparediff2-gl \
locale-libkomparediff2-hi \
locale-libkomparediff2-hr \
locale-libkomparediff2-hu \
locale-libkomparediff2-is \
locale-libkomparediff2-it \
locale-libkomparediff2-ja \
locale-libkomparediff2-ka \
locale-libkomparediff2-kk \
locale-libkomparediff2-km \
locale-libkomparediff2-ko \
locale-libkomparediff2-lt \
locale-libkomparediff2-lv \
locale-libkomparediff2-mai \
locale-libkomparediff2-mk \
locale-libkomparediff2-mr \
locale-libkomparediff2-ms \
locale-libkomparediff2-nb \
locale-libkomparediff2-nds \
locale-libkomparediff2-ne \
locale-libkomparediff2-nl \
locale-libkomparediff2-nn \
locale-libkomparediff2-oc \
locale-libkomparediff2-pa \
locale-libkomparediff2-pl \
locale-libkomparediff2-pt \
locale-libkomparediff2-pt-BR \
locale-libkomparediff2-ro \
locale-libkomparediff2-ru \
locale-libkomparediff2-sk \
locale-libkomparediff2-sl \
locale-libkomparediff2-sq \
locale-libkomparediff2-sr \
locale-libkomparediff2-sr@ijekavian \
locale-libkomparediff2-sr@ijekavianlatin \
locale-libkomparediff2-sr@latin \
locale-libkomparediff2-sv \
locale-libkomparediff2-ta \
locale-libkomparediff2-tr \
locale-libkomparediff2-ug \
locale-libkomparediff2-uk \
locale-libkomparediff2-zh-CN \
locale-libkomparediff2-zh-TW"

RDEPENDS:${PN} += "libkomparediff2"

inherit rpm

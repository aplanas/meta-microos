SUMMARY = "Translations for package libkdepim"
DESCRIPTION = "Provides translations for the 'libkdepim' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkdepim-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b9104b305c321af9882e0961a20b219dabb700a30e630e38e81825063f210976f7042592dbacf86bd1904e9f02c04f2da2cb66cf11b7490fddb004cf1081edda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdepim-lang \
libkdepim-lang-all \
locale-libkdepim-af \
locale-libkdepim-ar \
locale-libkdepim-be \
locale-libkdepim-bg \
locale-libkdepim-br \
locale-libkdepim-bs \
locale-libkdepim-ca \
locale-libkdepim-ca@valencia \
locale-libkdepim-cs \
locale-libkdepim-cy \
locale-libkdepim-da \
locale-libkdepim-de \
locale-libkdepim-el \
locale-libkdepim-en-GB \
locale-libkdepim-eo \
locale-libkdepim-es \
locale-libkdepim-et \
locale-libkdepim-eu \
locale-libkdepim-fa \
locale-libkdepim-fi \
locale-libkdepim-fr \
locale-libkdepim-ga \
locale-libkdepim-gl \
locale-libkdepim-he \
locale-libkdepim-hi \
locale-libkdepim-hr \
locale-libkdepim-hu \
locale-libkdepim-ia \
locale-libkdepim-is \
locale-libkdepim-it \
locale-libkdepim-ja \
locale-libkdepim-ka \
locale-libkdepim-kk \
locale-libkdepim-km \
locale-libkdepim-ko \
locale-libkdepim-lt \
locale-libkdepim-lv \
locale-libkdepim-mai \
locale-libkdepim-mk \
locale-libkdepim-mr \
locale-libkdepim-ms \
locale-libkdepim-nb \
locale-libkdepim-nds \
locale-libkdepim-ne \
locale-libkdepim-nl \
locale-libkdepim-nn \
locale-libkdepim-pa \
locale-libkdepim-pl \
locale-libkdepim-pt \
locale-libkdepim-pt-BR \
locale-libkdepim-ro \
locale-libkdepim-ru \
locale-libkdepim-sk \
locale-libkdepim-sl \
locale-libkdepim-sq \
locale-libkdepim-sr \
locale-libkdepim-sr@ijekavian \
locale-libkdepim-sr@ijekavianlatin \
locale-libkdepim-sr@latin \
locale-libkdepim-sv \
locale-libkdepim-ta \
locale-libkdepim-th \
locale-libkdepim-tr \
locale-libkdepim-ug \
locale-libkdepim-uk \
locale-libkdepim-wa \
locale-libkdepim-zh-CN \
locale-libkdepim-zh-TW"

RDEPENDS:${PN} += "libkdepim"

inherit rpm

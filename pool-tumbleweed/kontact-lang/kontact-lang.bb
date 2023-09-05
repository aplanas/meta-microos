SUMMARY = "Translations for package kontact"
DESCRIPTION = "Provides translations for the 'kontact' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kontact-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "438e310eec187b28444301894f1540e702eb4711e7cf8ee085705c52c5a70f30f97f651814358f7ada5fb21bae83ebb4756a9e132b4a0e743c3066ba70611d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kontact-lang \
kontact-lang-all \
locale-kontact-af \
locale-kontact-ar \
locale-kontact-az \
locale-kontact-be \
locale-kontact-bg \
locale-kontact-br \
locale-kontact-bs \
locale-kontact-ca \
locale-kontact-ca@valencia \
locale-kontact-cs \
locale-kontact-cy \
locale-kontact-da \
locale-kontact-de \
locale-kontact-el \
locale-kontact-en-GB \
locale-kontact-eo \
locale-kontact-es \
locale-kontact-et \
locale-kontact-eu \
locale-kontact-fa \
locale-kontact-fi \
locale-kontact-fr \
locale-kontact-ga \
locale-kontact-gl \
locale-kontact-he \
locale-kontact-hi \
locale-kontact-hr \
locale-kontact-hu \
locale-kontact-ia \
locale-kontact-id \
locale-kontact-is \
locale-kontact-it \
locale-kontact-ja \
locale-kontact-ka \
locale-kontact-kk \
locale-kontact-km \
locale-kontact-ko \
locale-kontact-lt \
locale-kontact-lv \
locale-kontact-mk \
locale-kontact-mr \
locale-kontact-ms \
locale-kontact-nb \
locale-kontact-nds \
locale-kontact-ne \
locale-kontact-nl \
locale-kontact-nn \
locale-kontact-pa \
locale-kontact-pl \
locale-kontact-pt \
locale-kontact-pt-BR \
locale-kontact-ro \
locale-kontact-ru \
locale-kontact-si \
locale-kontact-sk \
locale-kontact-sl \
locale-kontact-sq \
locale-kontact-sv \
locale-kontact-ta \
locale-kontact-th \
locale-kontact-tr \
locale-kontact-ug \
locale-kontact-uk \
locale-kontact-wa \
locale-kontact-zh-CN \
locale-kontact-zh-TW"

RDEPENDS:${PN} += "kontact"

inherit rpm

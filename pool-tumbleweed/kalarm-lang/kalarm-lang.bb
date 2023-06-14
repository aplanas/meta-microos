SUMMARY = "Translations for package kalarm"
DESCRIPTION = "Provides translations for the 'kalarm' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kalarm-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "c28df32a870db6bb5db39d65d38baa0f457e9fc5b0cbc63f97d64da9024ae06a5e140e9c6118a3771e8d504b5a96570b1930aefb23756a501845bd9cde0dce6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalarm-lang \
kalarm-lang-all \
locale-kalarm-af \
locale-kalarm-ar \
locale-kalarm-be \
locale-kalarm-bg \
locale-kalarm-br \
locale-kalarm-bs \
locale-kalarm-ca \
locale-kalarm-ca@valencia \
locale-kalarm-cs \
locale-kalarm-cy \
locale-kalarm-da \
locale-kalarm-de \
locale-kalarm-el \
locale-kalarm-en-GB \
locale-kalarm-eo \
locale-kalarm-es \
locale-kalarm-et \
locale-kalarm-eu \
locale-kalarm-fa \
locale-kalarm-fi \
locale-kalarm-fr \
locale-kalarm-ga \
locale-kalarm-gl \
locale-kalarm-he \
locale-kalarm-hi \
locale-kalarm-hr \
locale-kalarm-hu \
locale-kalarm-ia \
locale-kalarm-is \
locale-kalarm-it \
locale-kalarm-ja \
locale-kalarm-ka \
locale-kalarm-kk \
locale-kalarm-km \
locale-kalarm-ko \
locale-kalarm-lt \
locale-kalarm-lv \
locale-kalarm-mai \
locale-kalarm-mk \
locale-kalarm-mr \
locale-kalarm-ms \
locale-kalarm-nb \
locale-kalarm-nds \
locale-kalarm-ne \
locale-kalarm-nl \
locale-kalarm-nn \
locale-kalarm-pa \
locale-kalarm-pl \
locale-kalarm-pt \
locale-kalarm-pt-BR \
locale-kalarm-ro \
locale-kalarm-ru \
locale-kalarm-si \
locale-kalarm-sk \
locale-kalarm-sl \
locale-kalarm-sq \
locale-kalarm-sr \
locale-kalarm-sr@ijekavian \
locale-kalarm-sr@ijekavianlatin \
locale-kalarm-sr@latin \
locale-kalarm-sv \
locale-kalarm-ta \
locale-kalarm-tr \
locale-kalarm-ug \
locale-kalarm-uk \
locale-kalarm-wa \
locale-kalarm-zh-CN \
locale-kalarm-zh-TW"

RDEPENDS:${PN} += "kalarm"

inherit rpm

SUMMARY = "Translations for package kalarm"
DESCRIPTION = "Provides translations for the 'kalarm' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kalarm-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e7811531704e1c7ec2f8852fd957313b7d287c5ba80d1acf07a00ca716469b6f98c4586e63fc6498fdbf93c7fcbafb503f5a8ac94bfaaab4547ad8a661cbc032"
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

SUMMARY = "Translations for package akregator"
DESCRIPTION = "Provides translations for the 'akregator' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "akregator-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0dc3ead0af4d623c44980b626ea72e58cdb77192d33471eaa10ea5816bbdf7217c13214252c7945111177ae0de8189bbf550f2c86b1d69b657d724882c11a66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akregator-lang \
akregator-lang-all \
locale-akregator-ar \
locale-akregator-az \
locale-akregator-be \
locale-akregator-bg \
locale-akregator-br \
locale-akregator-bs \
locale-akregator-ca \
locale-akregator-ca@valencia \
locale-akregator-cs \
locale-akregator-cy \
locale-akregator-da \
locale-akregator-de \
locale-akregator-el \
locale-akregator-en-GB \
locale-akregator-eo \
locale-akregator-es \
locale-akregator-et \
locale-akregator-eu \
locale-akregator-fa \
locale-akregator-fi \
locale-akregator-fr \
locale-akregator-ga \
locale-akregator-gl \
locale-akregator-he \
locale-akregator-hi \
locale-akregator-hr \
locale-akregator-hu \
locale-akregator-ia \
locale-akregator-id \
locale-akregator-is \
locale-akregator-it \
locale-akregator-ja \
locale-akregator-ka \
locale-akregator-kk \
locale-akregator-km \
locale-akregator-ko \
locale-akregator-lt \
locale-akregator-lv \
locale-akregator-mk \
locale-akregator-mr \
locale-akregator-ms \
locale-akregator-nb \
locale-akregator-nds \
locale-akregator-ne \
locale-akregator-nl \
locale-akregator-nn \
locale-akregator-pa \
locale-akregator-pl \
locale-akregator-pt \
locale-akregator-pt-BR \
locale-akregator-ro \
locale-akregator-ru \
locale-akregator-sk \
locale-akregator-sl \
locale-akregator-sq \
locale-akregator-sr \
locale-akregator-sr@ijekavian \
locale-akregator-sr@ijekavianlatin \
locale-akregator-sr@latin \
locale-akregator-sv \
locale-akregator-ta \
locale-akregator-th \
locale-akregator-tr \
locale-akregator-ug \
locale-akregator-uk \
locale-akregator-vi \
locale-akregator-zh-CN \
locale-akregator-zh-TW"

RDEPENDS:${PN} += "akregator"

inherit rpm

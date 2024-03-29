SUMMARY = "Translations for package ksshaskpass5"
DESCRIPTION = "Provides translations for the 'ksshaskpass5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "ksshaskpass5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "77ed0454988c34aab04093fa4f16e3552ff9a01021654407068fe0f0ed39e5f51cf20fcaf9ab41dded46e59b99f348dc60464ce8a813749839821d004b499148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksshaskpass5-lang \
ksshaskpass5-lang-all \
locale-ksshaskpass5-ar \
locale-ksshaskpass5-bs \
locale-ksshaskpass5-ca \
locale-ksshaskpass5-ca@valencia \
locale-ksshaskpass5-cs \
locale-ksshaskpass5-da \
locale-ksshaskpass5-de \
locale-ksshaskpass5-el \
locale-ksshaskpass5-en-GB \
locale-ksshaskpass5-es \
locale-ksshaskpass5-et \
locale-ksshaskpass5-eu \
locale-ksshaskpass5-fi \
locale-ksshaskpass5-fr \
locale-ksshaskpass5-gl \
locale-ksshaskpass5-he \
locale-ksshaskpass5-hi \
locale-ksshaskpass5-hu \
locale-ksshaskpass5-ia \
locale-ksshaskpass5-id \
locale-ksshaskpass5-it \
locale-ksshaskpass5-ja \
locale-ksshaskpass5-ka \
locale-ksshaskpass5-ko \
locale-ksshaskpass5-lt \
locale-ksshaskpass5-ml \
locale-ksshaskpass5-nb \
locale-ksshaskpass5-nl \
locale-ksshaskpass5-nn \
locale-ksshaskpass5-pa \
locale-ksshaskpass5-pl \
locale-ksshaskpass5-pt \
locale-ksshaskpass5-pt-BR \
locale-ksshaskpass5-ro \
locale-ksshaskpass5-ru \
locale-ksshaskpass5-sk \
locale-ksshaskpass5-sl \
locale-ksshaskpass5-sr \
locale-ksshaskpass5-sr@ijekavian \
locale-ksshaskpass5-sr@ijekavianlatin \
locale-ksshaskpass5-sr@latin \
locale-ksshaskpass5-sv \
locale-ksshaskpass5-tr \
locale-ksshaskpass5-uk \
locale-ksshaskpass5-vi \
locale-ksshaskpass5-zh-CN \
locale-ksshaskpass5-zh-TW"

RDEPENDS:${PN} += "ksshaskpass5"

inherit rpm

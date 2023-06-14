SUMMARY = "Translations for package ktp-filetransfer-handler"
DESCRIPTION = "Provides translations for the 'ktp-filetransfer-handler' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-filetransfer-handler-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e814d3bb07cd9bb19b3628daf2ff7625587f6325de2228056d7a42dff5f6f7cb36995637c19dbf50a84c70b85c886601cb39d705325a0a9afc5f223674e1d158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-filetransfer-handler-lang \
ktp-filetransfer-handler-lang-all \
locale-ktp-filetransfer-handler-bs \
locale-ktp-filetransfer-handler-ca \
locale-ktp-filetransfer-handler-ca@valencia \
locale-ktp-filetransfer-handler-cs \
locale-ktp-filetransfer-handler-da \
locale-ktp-filetransfer-handler-de \
locale-ktp-filetransfer-handler-el \
locale-ktp-filetransfer-handler-en-GB \
locale-ktp-filetransfer-handler-es \
locale-ktp-filetransfer-handler-et \
locale-ktp-filetransfer-handler-eu \
locale-ktp-filetransfer-handler-fi \
locale-ktp-filetransfer-handler-fr \
locale-ktp-filetransfer-handler-ga \
locale-ktp-filetransfer-handler-gl \
locale-ktp-filetransfer-handler-hu \
locale-ktp-filetransfer-handler-ia \
locale-ktp-filetransfer-handler-it \
locale-ktp-filetransfer-handler-ja \
locale-ktp-filetransfer-handler-ka \
locale-ktp-filetransfer-handler-kk \
locale-ktp-filetransfer-handler-ko \
locale-ktp-filetransfer-handler-lt \
locale-ktp-filetransfer-handler-mr \
locale-ktp-filetransfer-handler-nb \
locale-ktp-filetransfer-handler-nds \
locale-ktp-filetransfer-handler-nl \
locale-ktp-filetransfer-handler-nn \
locale-ktp-filetransfer-handler-pl \
locale-ktp-filetransfer-handler-pt \
locale-ktp-filetransfer-handler-pt-BR \
locale-ktp-filetransfer-handler-ro \
locale-ktp-filetransfer-handler-ru \
locale-ktp-filetransfer-handler-sk \
locale-ktp-filetransfer-handler-sl \
locale-ktp-filetransfer-handler-sr \
locale-ktp-filetransfer-handler-sr@ijekavian \
locale-ktp-filetransfer-handler-sr@ijekavianlatin \
locale-ktp-filetransfer-handler-sr@latin \
locale-ktp-filetransfer-handler-sv \
locale-ktp-filetransfer-handler-tr \
locale-ktp-filetransfer-handler-ug \
locale-ktp-filetransfer-handler-uk \
locale-ktp-filetransfer-handler-zh-CN \
locale-ktp-filetransfer-handler-zh-TW"

RDEPENDS:${PN} += "ktp-filetransfer-handler"

inherit rpm

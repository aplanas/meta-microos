SUMMARY = "Translations for package ktp-common-internals"
DESCRIPTION = "Provides translations for the 'ktp-common-internals' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-common-internals-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9a74728a73ccf349785ded86806ead950c3f92e3cbcab272d3b124d09632c68b18ab36f177c35e8ba2b20957350ed96508b67807d63b86617e5fecc16c909211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-common-internals-lang \
ktp-common-internals-lang-all \
locale-ktp-common-internals-ar \
locale-ktp-common-internals-bs \
locale-ktp-common-internals-ca \
locale-ktp-common-internals-ca@valencia \
locale-ktp-common-internals-cs \
locale-ktp-common-internals-da \
locale-ktp-common-internals-de \
locale-ktp-common-internals-el \
locale-ktp-common-internals-en-GB \
locale-ktp-common-internals-es \
locale-ktp-common-internals-et \
locale-ktp-common-internals-eu \
locale-ktp-common-internals-fi \
locale-ktp-common-internals-fr \
locale-ktp-common-internals-ga \
locale-ktp-common-internals-gl \
locale-ktp-common-internals-hu \
locale-ktp-common-internals-ia \
locale-ktp-common-internals-it \
locale-ktp-common-internals-ja \
locale-ktp-common-internals-ka \
locale-ktp-common-internals-kk \
locale-ktp-common-internals-ko \
locale-ktp-common-internals-lt \
locale-ktp-common-internals-mr \
locale-ktp-common-internals-nb \
locale-ktp-common-internals-nds \
locale-ktp-common-internals-nl \
locale-ktp-common-internals-nn \
locale-ktp-common-internals-pa \
locale-ktp-common-internals-pl \
locale-ktp-common-internals-pt \
locale-ktp-common-internals-pt-BR \
locale-ktp-common-internals-ro \
locale-ktp-common-internals-ru \
locale-ktp-common-internals-sk \
locale-ktp-common-internals-sl \
locale-ktp-common-internals-sr \
locale-ktp-common-internals-sr@ijekavian \
locale-ktp-common-internals-sr@ijekavianlatin \
locale-ktp-common-internals-sr@latin \
locale-ktp-common-internals-sv \
locale-ktp-common-internals-tr \
locale-ktp-common-internals-ug \
locale-ktp-common-internals-uk \
locale-ktp-common-internals-zh-CN \
locale-ktp-common-internals-zh-TW"

RDEPENDS:${PN} += "ktp-common-internals"

inherit rpm

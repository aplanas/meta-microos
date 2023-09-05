SUMMARY = "Translations for package pimcommon"
DESCRIPTION = "Provides translations for the 'pimcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pimcommon-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0fcc1c156098c6bc1ba7a6d3fbd6c5b2d0b4b2fd5af862283befcc3fda5727d7a4d1050fbd2e0e0f8d5a4623055547fc80a8482025eb1318bf70b07ad9e6d44f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pimcommon-ar \
locale-pimcommon-bs \
locale-pimcommon-ca \
locale-pimcommon-ca@valencia \
locale-pimcommon-cs \
locale-pimcommon-da \
locale-pimcommon-de \
locale-pimcommon-el \
locale-pimcommon-en-GB \
locale-pimcommon-eo \
locale-pimcommon-es \
locale-pimcommon-et \
locale-pimcommon-eu \
locale-pimcommon-fi \
locale-pimcommon-fr \
locale-pimcommon-ga \
locale-pimcommon-gl \
locale-pimcommon-hu \
locale-pimcommon-ia \
locale-pimcommon-it \
locale-pimcommon-ja \
locale-pimcommon-ka \
locale-pimcommon-kk \
locale-pimcommon-ko \
locale-pimcommon-lt \
locale-pimcommon-mr \
locale-pimcommon-nb \
locale-pimcommon-nds \
locale-pimcommon-nl \
locale-pimcommon-pl \
locale-pimcommon-pt \
locale-pimcommon-pt-BR \
locale-pimcommon-ro \
locale-pimcommon-ru \
locale-pimcommon-sk \
locale-pimcommon-sl \
locale-pimcommon-sr \
locale-pimcommon-sr@ijekavian \
locale-pimcommon-sr@ijekavianlatin \
locale-pimcommon-sr@latin \
locale-pimcommon-sv \
locale-pimcommon-tr \
locale-pimcommon-ug \
locale-pimcommon-uk \
locale-pimcommon-zh-CN \
locale-pimcommon-zh-TW \
pimcommon-lang \
pimcommon-lang-all"

RDEPENDS:${PN} += "pimcommon"

inherit rpm

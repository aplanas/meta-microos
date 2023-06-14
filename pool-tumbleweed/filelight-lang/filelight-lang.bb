SUMMARY = "Translations for package filelight"
DESCRIPTION = "Provides translations for the 'filelight' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "filelight-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "0f3ac74e7e0a2dc967dfe8e22041d11a8a0cf5374ff7115c3888c945d867ec47bb7359c6581b9d2c02a0e6b5687840e45a972e5fc447b1725bed48b73234e601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filelight-lang \
filelight-lang-all \
locale-filelight-ar \
locale-filelight-az \
locale-filelight-bg \
locale-filelight-bs \
locale-filelight-ca \
locale-filelight-ca@valencia \
locale-filelight-cs \
locale-filelight-da \
locale-filelight-de \
locale-filelight-el \
locale-filelight-en-GB \
locale-filelight-eo \
locale-filelight-es \
locale-filelight-et \
locale-filelight-eu \
locale-filelight-fi \
locale-filelight-fr \
locale-filelight-ga \
locale-filelight-gl \
locale-filelight-hu \
locale-filelight-ia \
locale-filelight-is \
locale-filelight-it \
locale-filelight-ja \
locale-filelight-ka \
locale-filelight-kk \
locale-filelight-ko \
locale-filelight-lt \
locale-filelight-mr \
locale-filelight-nb \
locale-filelight-nds \
locale-filelight-nl \
locale-filelight-nn \
locale-filelight-pa \
locale-filelight-pl \
locale-filelight-pt \
locale-filelight-pt-BR \
locale-filelight-ro \
locale-filelight-ru \
locale-filelight-sk \
locale-filelight-sl \
locale-filelight-sr \
locale-filelight-sr@ijekavian \
locale-filelight-sr@ijekavianlatin \
locale-filelight-sr@latin \
locale-filelight-sv \
locale-filelight-ta \
locale-filelight-tr \
locale-filelight-ug \
locale-filelight-uk \
locale-filelight-zh-CN \
locale-filelight-zh-TW"

RDEPENDS:${PN} += "filelight"

inherit rpm

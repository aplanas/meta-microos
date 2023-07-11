SUMMARY = "Translations for package filelight"
DESCRIPTION = "Provides translations for the 'filelight' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "filelight-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "d7e500e678fb54fe2aab7cc309e043f06f5aaa76898900f5f8ff42b68e1c593abd7029056aa51a9f7b487659696d76be70fe1d3dd54ca76c7c8e83abe9ed730a"
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
locale-filelight-id \
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

SUMMARY = "Translations for package filelight"
DESCRIPTION = "Provides translations for the 'filelight' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "filelight-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "175d6df20609f02828bd9df4ba4b2a98dfa4dc6e9261a5c3a0e613355ff87982ec54d70830cb0eca5b35de79f2b66621e1494e11526938dd56162e6eed98516b"
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

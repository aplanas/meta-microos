SUMMARY = "Translations for package libokteta"
DESCRIPTION = "Provides translations for the 'libokteta' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "libokteta-lang-0.26.13-1.1.noarch.rpm"
RPM_HASH = "7a52aeeaaa67c12d2881bb14466c0dcbba870c5278fed8de71a6f13d82ed0aa4ef002cf3fa09c0d6fad5c0bf3b833bf8a19129b09e36250db5356daa7a63e9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libokteta-lang \
libokteta-lang-all \
locale-libokteta-ar \
locale-libokteta-ast \
locale-libokteta-bg \
locale-libokteta-bs \
locale-libokteta-ca \
locale-libokteta-ca@valencia \
locale-libokteta-cs \
locale-libokteta-da \
locale-libokteta-de \
locale-libokteta-el \
locale-libokteta-en-GB \
locale-libokteta-eo \
locale-libokteta-es \
locale-libokteta-et \
locale-libokteta-eu \
locale-libokteta-fi \
locale-libokteta-fr \
locale-libokteta-ga \
locale-libokteta-gl \
locale-libokteta-hr \
locale-libokteta-hu \
locale-libokteta-ia \
locale-libokteta-id \
locale-libokteta-is \
locale-libokteta-it \
locale-libokteta-ja \
locale-libokteta-ka \
locale-libokteta-kk \
locale-libokteta-ko \
locale-libokteta-lt \
locale-libokteta-lv \
locale-libokteta-mr \
locale-libokteta-nb \
locale-libokteta-nds \
locale-libokteta-nl \
locale-libokteta-nn \
locale-libokteta-pa \
locale-libokteta-pl \
locale-libokteta-pt \
locale-libokteta-pt-BR \
locale-libokteta-ro \
locale-libokteta-ru \
locale-libokteta-sk \
locale-libokteta-sl \
locale-libokteta-sq \
locale-libokteta-sr \
locale-libokteta-sr@ijekavian \
locale-libokteta-sr@ijekavianlatin \
locale-libokteta-sr@latin \
locale-libokteta-sv \
locale-libokteta-tr \
locale-libokteta-ug \
locale-libokteta-uk \
locale-libokteta-zh-CN \
locale-libokteta-zh-TW"

RDEPENDS:${PN} += "libokteta"

inherit rpm

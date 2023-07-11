SUMMARY = "Translations for package libKPim5IMAP5"
DESCRIPTION = "Provides translations for the 'libKPim5IMAP5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5IMAP5-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9fd52cf6fed2aa00d9cc30628c4ed126f1120113de11d266c74cd96624c562b3858f54b9d493ff8c83aba4682975405fa69087ed2a281447d3332e7d8b3a568f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5IMAP5-lang \
libKPim5IMAP5-lang-all \
locale-libKPim5IMAP5-ar \
locale-libKPim5IMAP5-bs \
locale-libKPim5IMAP5-ca \
locale-libKPim5IMAP5-ca@valencia \
locale-libKPim5IMAP5-cs \
locale-libKPim5IMAP5-da \
locale-libKPim5IMAP5-de \
locale-libKPim5IMAP5-el \
locale-libKPim5IMAP5-en-GB \
locale-libKPim5IMAP5-eo \
locale-libKPim5IMAP5-es \
locale-libKPim5IMAP5-et \
locale-libKPim5IMAP5-eu \
locale-libKPim5IMAP5-fi \
locale-libKPim5IMAP5-fr \
locale-libKPim5IMAP5-ga \
locale-libKPim5IMAP5-gl \
locale-libKPim5IMAP5-hu \
locale-libKPim5IMAP5-ia \
locale-libKPim5IMAP5-it \
locale-libKPim5IMAP5-ja \
locale-libKPim5IMAP5-ka \
locale-libKPim5IMAP5-kk \
locale-libKPim5IMAP5-km \
locale-libKPim5IMAP5-ko \
locale-libKPim5IMAP5-lt \
locale-libKPim5IMAP5-lv \
locale-libKPim5IMAP5-mr \
locale-libKPim5IMAP5-nb \
locale-libKPim5IMAP5-nds \
locale-libKPim5IMAP5-nl \
locale-libKPim5IMAP5-nn \
locale-libKPim5IMAP5-pa \
locale-libKPim5IMAP5-pl \
locale-libKPim5IMAP5-pt \
locale-libKPim5IMAP5-pt-BR \
locale-libKPim5IMAP5-ro \
locale-libKPim5IMAP5-ru \
locale-libKPim5IMAP5-sk \
locale-libKPim5IMAP5-sl \
locale-libKPim5IMAP5-sq \
locale-libKPim5IMAP5-sr \
locale-libKPim5IMAP5-sr@ijekavian \
locale-libKPim5IMAP5-sr@ijekavianlatin \
locale-libKPim5IMAP5-sr@latin \
locale-libKPim5IMAP5-sv \
locale-libKPim5IMAP5-tr \
locale-libKPim5IMAP5-ug \
locale-libKPim5IMAP5-uk \
locale-libKPim5IMAP5-zh-CN \
locale-libKPim5IMAP5-zh-TW"

RDEPENDS:${PN} += "libKPim5IMAP5"

inherit rpm

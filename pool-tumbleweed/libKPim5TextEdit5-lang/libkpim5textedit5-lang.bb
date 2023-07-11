SUMMARY = "Translations for package libKPim5TextEdit5"
DESCRIPTION = "Provides translations for the 'libKPim5TextEdit5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5TextEdit5-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "8b352b69cb10a4aa5b6ed7819840f4372b01a857b6983421ccf5f1eccea001dbd0aa9057504993b90bc9a0776204540c9309cc9295449ec1d0c1ec690d93f865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5TextEdit5-lang \
libKPim5TextEdit5-lang-all \
locale-libKPim5TextEdit5-ar \
locale-libKPim5TextEdit5-az \
locale-libKPim5TextEdit5-bs \
locale-libKPim5TextEdit5-ca \
locale-libKPim5TextEdit5-ca@valencia \
locale-libKPim5TextEdit5-cs \
locale-libKPim5TextEdit5-da \
locale-libKPim5TextEdit5-de \
locale-libKPim5TextEdit5-el \
locale-libKPim5TextEdit5-en-GB \
locale-libKPim5TextEdit5-eo \
locale-libKPim5TextEdit5-es \
locale-libKPim5TextEdit5-et \
locale-libKPim5TextEdit5-eu \
locale-libKPim5TextEdit5-fi \
locale-libKPim5TextEdit5-fr \
locale-libKPim5TextEdit5-ga \
locale-libKPim5TextEdit5-gl \
locale-libKPim5TextEdit5-hu \
locale-libKPim5TextEdit5-ia \
locale-libKPim5TextEdit5-it \
locale-libKPim5TextEdit5-ja \
locale-libKPim5TextEdit5-ka \
locale-libKPim5TextEdit5-kk \
locale-libKPim5TextEdit5-km \
locale-libKPim5TextEdit5-ko \
locale-libKPim5TextEdit5-lt \
locale-libKPim5TextEdit5-lv \
locale-libKPim5TextEdit5-mr \
locale-libKPim5TextEdit5-nb \
locale-libKPim5TextEdit5-nds \
locale-libKPim5TextEdit5-nl \
locale-libKPim5TextEdit5-nn \
locale-libKPim5TextEdit5-pa \
locale-libKPim5TextEdit5-pl \
locale-libKPim5TextEdit5-pt \
locale-libKPim5TextEdit5-pt-BR \
locale-libKPim5TextEdit5-ro \
locale-libKPim5TextEdit5-ru \
locale-libKPim5TextEdit5-sk \
locale-libKPim5TextEdit5-sl \
locale-libKPim5TextEdit5-sq \
locale-libKPim5TextEdit5-sr \
locale-libKPim5TextEdit5-sr@ijekavian \
locale-libKPim5TextEdit5-sr@ijekavianlatin \
locale-libKPim5TextEdit5-sr@latin \
locale-libKPim5TextEdit5-sv \
locale-libKPim5TextEdit5-tr \
locale-libKPim5TextEdit5-ug \
locale-libKPim5TextEdit5-uk \
locale-libKPim5TextEdit5-zh-CN \
locale-libKPim5TextEdit5-zh-TW"

RDEPENDS:${PN} += "libKPim5TextEdit5"

inherit rpm

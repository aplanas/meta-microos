SUMMARY = "Translations for package kde-print-manager"
DESCRIPTION = "Provides translations for the 'kde-print-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kde-print-manager-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e37844a4b26bc6cfa67b147dea0bc6d7b2e95ff8deffb8ba2d87b4a8fc8692640f45b988b9c52172f7d9b370e15516241397e6b00d007d4f3b086c0476eea8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-print-manager-lang \
kde-print-manager-lang-all \
locale-kde-print-manager-ar \
locale-kde-print-manager-az \
locale-kde-print-manager-be \
locale-kde-print-manager-bg \
locale-kde-print-manager-bs \
locale-kde-print-manager-ca \
locale-kde-print-manager-ca@valencia \
locale-kde-print-manager-cs \
locale-kde-print-manager-da \
locale-kde-print-manager-de \
locale-kde-print-manager-el \
locale-kde-print-manager-en-GB \
locale-kde-print-manager-es \
locale-kde-print-manager-et \
locale-kde-print-manager-eu \
locale-kde-print-manager-fi \
locale-kde-print-manager-fr \
locale-kde-print-manager-ga \
locale-kde-print-manager-gl \
locale-kde-print-manager-hu \
locale-kde-print-manager-ia \
locale-kde-print-manager-id \
locale-kde-print-manager-is \
locale-kde-print-manager-it \
locale-kde-print-manager-ja \
locale-kde-print-manager-ka \
locale-kde-print-manager-kk \
locale-kde-print-manager-km \
locale-kde-print-manager-ko \
locale-kde-print-manager-lt \
locale-kde-print-manager-mr \
locale-kde-print-manager-nb \
locale-kde-print-manager-nds \
locale-kde-print-manager-nl \
locale-kde-print-manager-nn \
locale-kde-print-manager-pa \
locale-kde-print-manager-pl \
locale-kde-print-manager-pt \
locale-kde-print-manager-pt-BR \
locale-kde-print-manager-ro \
locale-kde-print-manager-ru \
locale-kde-print-manager-sk \
locale-kde-print-manager-sl \
locale-kde-print-manager-sr \
locale-kde-print-manager-sr@ijekavian \
locale-kde-print-manager-sr@ijekavianlatin \
locale-kde-print-manager-sr@latin \
locale-kde-print-manager-sv \
locale-kde-print-manager-ta \
locale-kde-print-manager-tr \
locale-kde-print-manager-ug \
locale-kde-print-manager-uk \
locale-kde-print-manager-zh-CN \
locale-kde-print-manager-zh-TW"

RDEPENDS:${PN} += "kde-print-manager"

inherit rpm

SUMMARY = "Translations for package libKPim5AkonadiCalendar5"
DESCRIPTION = "Provides translations for the 'libKPim5AkonadiCalendar5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiCalendar5-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ac21dab3ce940b9283794437b53baf7bfdf22f3ba5147118816720dfc7d7853b0bb380a75ef83ab79140e3588757783d4d2f28442d4fb9943abff5b7295f7222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5AkonadiCalendar5-lang \
libKPim5AkonadiCalendar5-lang-all \
locale-libKPim5AkonadiCalendar5-ar \
locale-libKPim5AkonadiCalendar5-az \
locale-libKPim5AkonadiCalendar5-bg \
locale-libKPim5AkonadiCalendar5-bs \
locale-libKPim5AkonadiCalendar5-ca \
locale-libKPim5AkonadiCalendar5-ca@valencia \
locale-libKPim5AkonadiCalendar5-cs \
locale-libKPim5AkonadiCalendar5-da \
locale-libKPim5AkonadiCalendar5-de \
locale-libKPim5AkonadiCalendar5-el \
locale-libKPim5AkonadiCalendar5-en-GB \
locale-libKPim5AkonadiCalendar5-es \
locale-libKPim5AkonadiCalendar5-et \
locale-libKPim5AkonadiCalendar5-eu \
locale-libKPim5AkonadiCalendar5-fi \
locale-libKPim5AkonadiCalendar5-fr \
locale-libKPim5AkonadiCalendar5-ga \
locale-libKPim5AkonadiCalendar5-gl \
locale-libKPim5AkonadiCalendar5-hu \
locale-libKPim5AkonadiCalendar5-ia \
locale-libKPim5AkonadiCalendar5-id \
locale-libKPim5AkonadiCalendar5-it \
locale-libKPim5AkonadiCalendar5-ja \
locale-libKPim5AkonadiCalendar5-ka \
locale-libKPim5AkonadiCalendar5-kk \
locale-libKPim5AkonadiCalendar5-km \
locale-libKPim5AkonadiCalendar5-ko \
locale-libKPim5AkonadiCalendar5-lt \
locale-libKPim5AkonadiCalendar5-lv \
locale-libKPim5AkonadiCalendar5-mai \
locale-libKPim5AkonadiCalendar5-mr \
locale-libKPim5AkonadiCalendar5-nb \
locale-libKPim5AkonadiCalendar5-nds \
locale-libKPim5AkonadiCalendar5-nl \
locale-libKPim5AkonadiCalendar5-pa \
locale-libKPim5AkonadiCalendar5-pl \
locale-libKPim5AkonadiCalendar5-pt \
locale-libKPim5AkonadiCalendar5-pt-BR \
locale-libKPim5AkonadiCalendar5-ro \
locale-libKPim5AkonadiCalendar5-ru \
locale-libKPim5AkonadiCalendar5-sk \
locale-libKPim5AkonadiCalendar5-sl \
locale-libKPim5AkonadiCalendar5-sr \
locale-libKPim5AkonadiCalendar5-sr@ijekavian \
locale-libKPim5AkonadiCalendar5-sr@ijekavianlatin \
locale-libKPim5AkonadiCalendar5-sr@latin \
locale-libKPim5AkonadiCalendar5-sv \
locale-libKPim5AkonadiCalendar5-ta \
locale-libKPim5AkonadiCalendar5-tr \
locale-libKPim5AkonadiCalendar5-ug \
locale-libKPim5AkonadiCalendar5-uk \
locale-libKPim5AkonadiCalendar5-zh-CN \
locale-libKPim5AkonadiCalendar5-zh-TW"

RDEPENDS:${PN} += "libKPim5AkonadiCalendar5"

inherit rpm

SUMMARY = "Translations for package boinc-client"
DESCRIPTION = "Provides translations for the 'boinc-client' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "boinc-client-lang-7.24.1-1.1.noarch.rpm"
RPM_HASH = "977113c0ac25ff9f8dd945b2e988b4958baf18db8fb80f9da7028b1fdc6b2343f4d62e296a4d02f1f78b8829fa1a61d3446214dbccd8b1042c9d0c4e64ce457a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-client-lang \
boinc-client-lang-all \
locale-boinc-client-ar \
locale-boinc-client-bg \
locale-boinc-client-ca \
locale-boinc-client-cs \
locale-boinc-client-da \
locale-boinc-client-de \
locale-boinc-client-el \
locale-boinc-client-es \
locale-boinc-client-fi \
locale-boinc-client-fr \
locale-boinc-client-he \
locale-boinc-client-hu \
locale-boinc-client-it-IT \
locale-boinc-client-ja \
locale-boinc-client-ka \
locale-boinc-client-ko \
locale-boinc-client-lt \
locale-boinc-client-lv \
locale-boinc-client-nb \
locale-boinc-client-nl \
locale-boinc-client-pl \
locale-boinc-client-pt-BR \
locale-boinc-client-ro \
locale-boinc-client-ru \
locale-boinc-client-sk \
locale-boinc-client-sv \
locale-boinc-client-tr \
locale-boinc-client-uk \
locale-boinc-client-zh-CN \
locale-boinc-client-zh-TW"

RDEPENDS:${PN} += "boinc-client"

inherit rpm

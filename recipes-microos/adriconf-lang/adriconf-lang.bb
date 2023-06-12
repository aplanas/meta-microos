SUMMARY = "Translations for package adriconf"
DESCRIPTION = "Provides translations for the 'adriconf' package."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "adriconf-lang-2.7.0-1.1.noarch.rpm"
RPM_HASH = "e8794acb5633dfa0468e7c16de673427626259d16e662a0ca7defd0345dc4c11d900aec01cc55598bbb64855c22085d7b8a2dfd595c764253607eb23bf008485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adriconf-lang \
adriconf-lang-all \
locale(adriconf:en) \
locale(adriconf:hr) \
locale(adriconf:lv) \
locale(adriconf:pl) \
locale(adriconf:pt_BR) \
locale(adriconf:zh_CN)"
RDEPENDS:${PN} += "adriconf"

inherit rpm

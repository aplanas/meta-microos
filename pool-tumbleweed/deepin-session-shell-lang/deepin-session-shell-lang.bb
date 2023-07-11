SUMMARY = "Translations for package deepin-session-shell"
DESCRIPTION = "Provides translations for the 'deepin-session-shell' package."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-lang-5.5.48-1.5.noarch.rpm"
RPM_HASH = "3f861f1121266dc74deca63ef00cea70629783594299328c9b456dbf208df4a7f98d93ad8954e6c2e1aa46a9bbc963ddfd249fbc682a298b2f5c365b1cc1438e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-session-shell-lang \
deepin-session-shell-lang-all"

RDEPENDS:${PN} += "deepin-session-shell"

inherit rpm

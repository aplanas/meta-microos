SUMMARY = "Translations for package makeinfo"
DESCRIPTION = "Provides translations for the 'makeinfo' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-lang-7.0.3-1.4.noarch.rpm"
RPM_HASH = "214218ace5864aa452071e734a8b66d80cbe4903de9a3ac9254db65127d329a73228cd949ee1634dad76a7ac64580b7b94f30b6a1a249abb15aca4812f39e094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-makeinfo-ca \
locale-makeinfo-cs \
locale-makeinfo-de \
locale-makeinfo-eo \
locale-makeinfo-es \
locale-makeinfo-fi \
locale-makeinfo-fr \
locale-makeinfo-hr \
locale-makeinfo-hu \
locale-makeinfo-it \
locale-makeinfo-nl \
locale-makeinfo-pl \
locale-makeinfo-pt \
locale-makeinfo-pt-BR \
locale-makeinfo-ro \
locale-makeinfo-sk \
locale-makeinfo-sr \
locale-makeinfo-sv \
locale-makeinfo-uk \
makeinfo-lang \
makeinfo-lang-all"

RDEPENDS:${PN} += "makeinfo"

inherit rpm

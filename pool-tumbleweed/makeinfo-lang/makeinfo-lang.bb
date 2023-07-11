SUMMARY = "Translations for package makeinfo"
DESCRIPTION = "Provides translations for the 'makeinfo' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-lang-7.0.3-1.3.noarch.rpm"
RPM_HASH = "7b1864bf5634c56f15af0a98a0976ea40748319bebfd9b80f16f15544adae7a05914358285d2e05e796db78da04278fd4d88ed00d7b526581b895a6df8d4d1b1"
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

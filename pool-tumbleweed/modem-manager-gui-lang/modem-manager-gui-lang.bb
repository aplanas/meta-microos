SUMMARY = "Translations for package modem-manager-gui"
DESCRIPTION = "Provides translations for the 'modem-manager-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.20"

RPM_NAME = "modem-manager-gui-lang-0.0.20-4.3.noarch.rpm"
RPM_HASH = "6250a6eb2a2e9a03e88b9cfdfb0bea84b8bda99659e34b7820e77cbff2920671030cdc571e9531f281c413c76eed43b7876b7d76a428ec69972508c3ffd6f6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-modem-manager-gui-ar \
locale-modem-manager-gui-de \
locale-modem-manager-gui-es \
locale-modem-manager-gui-fr \
locale-modem-manager-gui-hu \
locale-modem-manager-gui-id \
locale-modem-manager-gui-it \
locale-modem-manager-gui-lt \
locale-modem-manager-gui-pl \
locale-modem-manager-gui-pl-PL \
locale-modem-manager-gui-pt-BR \
locale-modem-manager-gui-ru \
locale-modem-manager-gui-tr \
locale-modem-manager-gui-uk \
locale-modem-manager-gui-zh-CN \
modem-manager-gui-lang \
modem-manager-gui-lang-all"

RDEPENDS:${PN} += "modem-manager-gui"

inherit rpm

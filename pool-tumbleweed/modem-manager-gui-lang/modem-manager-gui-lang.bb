SUMMARY = "Translations for package modem-manager-gui"
DESCRIPTION = "Provides translations for the 'modem-manager-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.20"

RPM_NAME = "modem-manager-gui-lang-0.0.20-4.4.noarch.rpm"
RPM_HASH = "e00892721772aaec3795f67a191cbbaaad12f3b79e9ce0fc380db93a67563f01733b355672b9c44cf2f82a4d90a9db9214ddfd4f0df4935bc94687b5f4546c7e"
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

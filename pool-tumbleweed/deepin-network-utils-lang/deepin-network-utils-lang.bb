SUMMARY = "Translations for package deepin-network-utils"
DESCRIPTION = "Provides translations for the 'deepin-network-utils' package."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-lang-5.4.13-1.8.noarch.rpm"
RPM_HASH = "d578fe93bbf6d1b2c3635da30342944e7e9487018b388c808c153e0d2787e177b17e4d71252ca6345c66af53ba21514e5a164b91cd823d1606d61704bc55dad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-network-utils-lang \
deepin-network-utils-lang-all"

RDEPENDS:${PN} += "deepin-network-utils"

inherit rpm

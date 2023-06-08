SUMMARY = "Translations for package deepin-network-utils"
DESCRIPTION = "Provides translations for the 'deepin-network-utils' package."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "deepin-network-utils-lang-5.4.13-1.7.noarch.rpm"
RPM_HASH = "aab905f774e5e75e963ed35495ef2c74e2e89dcf555fe04288ecb45ffb669803b36baa103ca4bb9158d7ffb69ea118b2a0610837f297e09ab36d38f40ad9c5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-network-utils-lang deepin-network-utils-lang-all"
RDEPENDS:${PN} += "deepin-network-utils"

inherit rpm

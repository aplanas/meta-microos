SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sq-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "89158e01b77182062eefcc19b8f299420245335cbe0ff3c02837687a428b12a7069c4bc3882c26b833a4493d7061ee436f3ed414560ac93eedc806bb436cf56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sq) \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm

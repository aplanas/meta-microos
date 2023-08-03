SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-tr-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "21088319783750254c59e49b466715851fa4ab6461f87597c19cbca018498f5098c1e4af14802562c6d35f4bd5997cd358a013bde8b40afde4aa5d52c2a532be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-hu-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "fd83b17ee3efa7fc0ac0fb10fa8632d53299256ee5ebbb71050435baba0900894a9a0544d70165d1a1c64f9eb3fb0b06b4b12b58570412c91ac9e79f13bed4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm

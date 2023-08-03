SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-cy-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2ea5c98d58b0a866e69540555a5bfffad4737e77e414368ac9aa6d6cb89e35bbd8ffa3f00808e351407e8b760c80fdefc5bd9ed389c8723022504a2866dffbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm

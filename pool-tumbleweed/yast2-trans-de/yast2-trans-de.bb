SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-de-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "7fa6afd13161d329869162c85782a96b6f8ac6fe099b492ccff38dca17b8e3c51f7a2f55354fc1ad494ff72ff9365eb6f9ae3b248dccde7cceecbafe57404a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm

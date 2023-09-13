SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-nn-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "cc5969cc1b924c142e983956030d491de5667e27fd8073ea945247da1ec2a19509b1602aa07aba8ee3468d5317edaf18d68b023ef886568a6ec1936fd17337a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm

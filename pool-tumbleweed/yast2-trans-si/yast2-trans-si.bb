SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-si-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "c86459de677ece1e41407199168284080a954f97020b50f074c0d862a8278f4d7c6350bd63134ef58b7f0828680740e2e708ef07fb30d3d2f9a0d2b996f8c077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-cs-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "80819776d6d252f88c963659048e4abe2d222b3039f08d35558a3e985722cfcbfa10977233a7ff561081e66a0e1a396d6f9fe9b838d67dc27ef93f0c92c6a3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm

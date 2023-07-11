SUMMARY = "Architecture independent data for edgar"
DESCRIPTION = "This package contains the game data for edgar. \
It is required to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "edgar-data-1.36-1.4.noarch.rpm"
RPM_HASH = "0d9395488dea510e49a068a76aa904feb4d78e9d20d29bedfc765e9c30f011c29f76f8b20d82160601d6bdb94dfeae0a60f3bfdcc65497aef8c18cd8338c5a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-data"

RDEPENDS:${PN} += "edgar"

inherit rpm

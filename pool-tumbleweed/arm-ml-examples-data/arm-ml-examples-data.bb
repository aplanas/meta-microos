SUMMARY = "Data files for arm-ml-examples"
DESCRIPTION = "Data used by machine learning tutorials and examples from Arm's ML developer space."
LICENSE = "Apache-2.0"

PV = "0.0~git20200114.7f6276c"

RPM_NAME = "arm-ml-examples-data-0.0~git20200114.7f6276c-1.2.noarch.rpm"
RPM_HASH = "1621f9c566149ef67d88d287335b041a6f377361c658af9921674c0ccdde0574f73368917ff9759e7d932a3ef0cd9ebbb90b30a757227a86343194c2e37c2f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-ml-examples-data"

RDEPENDS:${PN} += ""

inherit rpm

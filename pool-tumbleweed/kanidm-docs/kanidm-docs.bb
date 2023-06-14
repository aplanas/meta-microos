SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-docs-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "943ca9e1d414804514c46431fc6470bff58e38158791683f4cf982b1c69ea3c4fa2d5955dca155b52bf1f6b98b36806af789b1ade22857eb89a1709e4aa74d35"

RPROVIDES:${PN} += "kanidm-docs"

RDEPENDS:${PN} += ""

inherit rpm

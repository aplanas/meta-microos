SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-pr-helper-conf-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "7407876aba7314944f3e76821fab9a31484167062f8131205bbad62d9f621fbff36d3a4735fec82034b9dfafc60a2e6b84d8d209887da518e1e5aa5af88d2d58"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf"

RDEPENDS:${PN} += ""

inherit rpm

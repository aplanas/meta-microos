SUMMARY = "SAP Netweaver platform deployment formula"
DESCRIPTION = "SAP Netweaver deployment salt formula. This formula is capable to install \
SAP Netweaver instances (ASCS, ERS, PAS, AAS) and perform some basic actions to optimize \
their usage. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.6.6+git.1625824616.eb6e12c"

RPM_NAME = "sapnwbootstrap-formula-0.6.6+git.1625824616.eb6e12c-1.6.noarch.rpm"
RPM_HASH = "09104189247a43b289d03f16a0c2a57f7ff0a06ea9b42eb5b0224351050169e461ba124d36a168ebbe4d6a370743598e67fd8253139c3ecff411702c0f9bcab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapnwbootstrap-formula"
RDEPENDS:${PN} += "habootstrap-formula \
salt-formulas-configuration \
salt-shaptools"

inherit rpm

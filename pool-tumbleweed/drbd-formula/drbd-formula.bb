SUMMARY = "DRBD deployment salt formula"
DESCRIPTION = "DRBD deployment salt formula \
Available on SUSE manager 4.0 \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.4.4+git.1625210904.93ea1f9"

RPM_NAME = "drbd-formula-0.4.4+git.1625210904.93ea1f9-1.6.noarch.rpm"
RPM_HASH = "0e65f30148d68c3f7ed0636f832f4e10912622a013d482cfdcf2f96c5a9321bf7061c9e300f14188d937b95d53866db357c6f3b789bb50b233d33cafbc27058a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drbd-formula"

RDEPENDS:${PN} += "/usr/bin/bash \
drbd-utils \
salt-formulas-configuration \
salt-shaptools"

inherit rpm

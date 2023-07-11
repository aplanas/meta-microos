SUMMARY = "System status data collection utility"
DESCRIPTION = "Similar to the 'sar' program, collectl does collection of device performance \
information. It features: \
* Fine-grained non-drifting monitoring \
* Aggregates performance numbers or device-individual reports \
* Aligned monitoring intervals \
* Process and slab monitoring \
* Monitoring of process i/o statistics \
* IPMI monitoring for fans and temperature sensors \
* API for importing additional data"
LICENSE = "Artistic-1.0 & GPL-2.0-or-later"

PV = "4.3.8"

RPM_NAME = "collectl-4.3.8-1.2.noarch.rpm"
RPM_HASH = "589cb47d56a8dd70702c191d9e3c95a5ae99d91c7e6ce321fba74c012bccd82c355fb3bb931207dba3912873968ac2f868d903f15269aa499b9bd0f463126795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectl \
config-collectl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
systemd"

inherit rpm

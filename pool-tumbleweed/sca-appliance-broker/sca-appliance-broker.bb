SUMMARY = "Supportconfig Analysis Appliance Broker"
DESCRIPTION = "Monitors inbound supportconfig archives and is responsible for \
assigning new and retry archives states for appropriate agent analysis. \
 \
See /usr/share/doc/packages/sca-appliance-common/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "sca-appliance-broker-1.3.2-1.3.noarch.rpm"
RPM_HASH = "21803c0917872411d28692ac16cf134f627110c99a90b4ce5ccd3f4827ee56736b12d1ae03902fb8b749c74a460d96609240324ddb837e6fa5ef6615d5c26e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sca-appliance-broker \
sca-appliance-broker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
sca-appliance-common"

inherit rpm

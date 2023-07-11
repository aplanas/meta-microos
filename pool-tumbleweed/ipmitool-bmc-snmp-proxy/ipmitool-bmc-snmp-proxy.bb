SUMMARY = "SNMP configuration to include the BMC's SNMP agent"
DESCRIPTION = "Given a host with BMC, this package would extend system configuration \
of net-snmp to include redirections to BMC based SNMP."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.0.g19d7878"

RPM_NAME = "ipmitool-bmc-snmp-proxy-1.8.19.0.g19d7878-1.5.noarch.rpm"
RPM_HASH = "cb112fa16822d4a6b16baca6c694363e81c47bd1d34b68987770756adaf417f621daa0688ea889cb4b30ad9e82d2d2113a466403ac12543832fcfaab32ce5d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ipmitool-bmc-snmp-proxy \
ipmitool-bmc-snmp-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ipmitool \
net-snmp"

inherit rpm

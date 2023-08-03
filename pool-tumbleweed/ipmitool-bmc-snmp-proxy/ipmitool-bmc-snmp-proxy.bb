SUMMARY = "SNMP configuration to include the BMC's SNMP agent"
DESCRIPTION = "Given a host with BMC, this package would extend system configuration \
of net-snmp to include redirections to BMC based SNMP."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.13.gbe11d94"

RPM_NAME = "ipmitool-bmc-snmp-proxy-1.8.19.13.gbe11d94-1.1.noarch.rpm"
RPM_HASH = "52bafd57c2157f0cc3f554775dd27272f5e7de400d4d4ac3a81664921daae3f6c172035f6d47fc19773b1acef1aa2b4c52f14655143ab02ddc975c93d4b11435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ipmitool-bmc-snmp-proxy \
ipmitool-bmc-snmp-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ipmitool \
net-snmp"

inherit rpm

SUMMARY = "Utility for IPMI Control"
DESCRIPTION = "This package contains a utility for interfacing with devices that \
support the Intelligent Platform Management Interface specification. \
IPMI is an open standard for machine health, inventory, and remote \
power control. \
 \
This utility can communicate with IPMI-enabled devices through either a \
kernel driver such as OpenIPMI or over the RMCP LAN protocol defined in \
the IPMI specification.  IPMIv2 adds support for encrypted LAN \
communications and remote Serial-over-LAN functionality. \
 \
It provides commands for reading the Sensor Data Repository (SDR) and \
displaying sensor values, displaying the contents of the System Event \
Log (SEL), printing Field Replaceable Unit (FRU) information, reading \
and setting LAN configuration, and chassis power control."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.13.gbe11d94"

RPM_NAME = "ipmitool-1.8.19.13.gbe11d94-1.1.aarch64.rpm"
RPM_HASH = "cd87ad6d7384c19ba33efdc51614cfd48ea57d489d85093129e57ab9adbe83db7b36f9b9e1e39e9e0b81b490cda3ec8af263a4a4da11dcd29dd161d72a742b80"

RPROVIDES:${PN} += "config-ipmitool \
ipmitool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfreeipmi.so.17 \
libm.so.6 \
libreadline.so.8"

inherit rpm

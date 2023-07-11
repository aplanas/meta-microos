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

PV = "1.8.19.0.g19d7878"

RPM_NAME = "ipmitool-1.8.19.0.g19d7878-1.5.aarch64.rpm"
RPM_HASH = "419a4b088b25c4c55867d91641a987f6e246431fd2254c324cbad8f1e7cf716efd2351667db3886674e0af6da5c82b7887dd5335c33fcad5f4b395d56bbdca29"

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

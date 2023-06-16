SUMMARY = "Poor-man’s PSCI monitor for Raspberry Pi4"
DESCRIPTION = "PSCI EL3 monitor for Raspberry Pi4. Monitor is used to workaround \
CVE-2017-5715 and CVE-2018-3639 for Cortex-A72 CPU used in BCM2711."
LICENSE = "BSD-3-Clause"

PV = "2020.09.24"

RPM_NAME = "raspberrypi-tools-armstubs-2020.09.24-1.8.aarch64.rpm"
RPM_HASH = "a5e1653a41ba07378cf3f08a535cdea194fd80506e06c219e419361b04681c847a96965c91717361e17af2865f37cf914dcd30bcb5b44cf8606e5b067cb0b936"

RPROVIDES:${PN} += "raspberrypi-tools-armstubs"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

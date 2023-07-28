SUMMARY = "script to install shim with sd-boot"
DESCRIPTION = "Hook scripts to install shim along with systemd-boot"
LICENSE = "MIT"

PV = "1+git20230717.dac075e"

RPM_NAME = "sdbootutil-1+git20230717.dac075e-1.1.aarch64.rpm"
RPM_HASH = "c823373ca16bfbb0c2ae30e6e57d6eaeff03c6eac4043beeaaea82f1173e0e405813f83b37c6f2cee4532d948114c6eb96a7ff014a0dcd841e75aab5fad90f5d"

RPROVIDES:${PN} += "sdbootutil"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
sed \
systemd-boot"

inherit rpm

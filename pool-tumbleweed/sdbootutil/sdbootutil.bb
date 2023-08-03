SUMMARY = "script to install shim with sd-boot"
DESCRIPTION = "Hook scripts to install shim along with systemd-boot"
LICENSE = "MIT"

PV = "1+git20230727.a0e666f"

RPM_NAME = "sdbootutil-1+git20230727.a0e666f-1.1.aarch64.rpm"
RPM_HASH = "dfc478f023c55d0d9b8371aac3b031015c30c08811693a1c77ea1620af4b830d44f3298f5414f62e2af17fc4484b086674f68daa26e76e168a5e6826376b2330"

RPROVIDES:${PN} += "sdbootutil"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
sed \
systemd-boot"

inherit rpm

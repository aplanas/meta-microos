SUMMARY = "script to install shim with sd-boot"
DESCRIPTION = "Hook scripts to install shim along with systemd-boot"
LICENSE = "MIT"

PV = "1+git20230814.38973c7"

RPM_NAME = "sdbootutil-1+git20230814.38973c7-1.1.aarch64.rpm"
RPM_HASH = "67b2fc0eb5759c129220b07b13f25dd134abc255654b3fd95aa0b3ec16ad7edf3c88ec366c08ed7a1abf032b5c17cfa27bbf325287b4dd428eddce5e893e01d5"

RPROVIDES:${PN} += "sdbootutil"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
sed \
systemd-boot"

inherit rpm

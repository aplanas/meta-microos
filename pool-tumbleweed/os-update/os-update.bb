SUMMARY = "Updates the system regularly to stay current and safe"
DESCRIPTION = "Service to keep an OS update to date and secure. It is run by a \
systemd.timer daily and can inform rebootmgrd that the update \
requires a reboot."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "os-update-1.11-2.2.noarch.rpm"
RPM_HASH = "27ba3e41a5b45865e3092a67ad80df09a0cd4a5fbda3e60e720262a6a591fe8312f788a2391acc1897012b50e2df36d069668d619507bbaaca6796c7f800387a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
lsof \
zypper-needs-restarting"

inherit rpm

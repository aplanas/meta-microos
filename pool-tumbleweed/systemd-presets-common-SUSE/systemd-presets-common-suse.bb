SUMMARY = "Systemd default presets for SUSE distributions"
DESCRIPTION = "Default presets for systemd on SUSE based distributions."
LICENSE = "GPL-2.0-or-later"

PV = "15"

RPM_NAME = "systemd-presets-common-SUSE-15-30.1.noarch.rpm"
RPM_HASH = "e013d173709c51d78c20d8fac105bbd1a067ffdaafda4c48c8fec55988d74c91ee733258e51a8b021e7e6039e99e0558586f988344c0b1971ac0653f31f26108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-common-SUSE"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
coreutils"

inherit rpm

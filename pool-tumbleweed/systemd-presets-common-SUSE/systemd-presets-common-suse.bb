SUMMARY = "Systemd default presets for SUSE distributions"
DESCRIPTION = "Default presets for systemd on SUSE based distributions."
LICENSE = "GPL-2.0-or-later"

PV = "15"

RPM_NAME = "systemd-presets-common-SUSE-15-28.1.noarch.rpm"
RPM_HASH = "3a237ec15807e44cde93ff6842d4bfe27ae3f7d2a0a893bcf475dcaa12a3ded0ba452ea6c78f93a1285772e9e976e3f12edc840680037245fd0d46369bb17fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-common-SUSE"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bash \
coreutils"

inherit rpm

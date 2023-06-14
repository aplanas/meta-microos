SUMMARY = "Scripts for btrfs periodic maintenance tasks"
DESCRIPTION = "Scripts for btrfs maintenance tasks like periodic scrub, balance, trim or defrag \
on selected mountpoints or directories. Hints for periodic snapshot tuning (eg. \
for snapper)."
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "btrfsmaintenance-0.5-2.7.noarch.rpm"
RPM_HASH = "fdf02b2f1290b70e23998f00caf6d15856f38a3c835a4c10eba40a0420d9b023b72830aaab4f12aa2938b0a247c08b32dfc562ca58c67c38720891fd71681a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsmaintenance"

RDEPENDS:${PN} += "-libzypp(plugin-commit) if zypper \
/bin/bash \
/bin/sh \
btrfsprogs"

inherit rpm

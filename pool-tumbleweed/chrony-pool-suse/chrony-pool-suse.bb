SUMMARY = "Chrony preconfiguration for SUSE"
DESCRIPTION = "This package configures chrony to use the SUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.4"

RPM_NAME = "chrony-pool-suse-4.4-1.1.noarch.rpm"
RPM_HASH = "9c6137c5e1e4fb9516ac7ab96fe475c21bcecceac65163cdfe78de7ad61c621b59f2f2c01761ecdfa1f94b49f2f888b27005598bb4c72c3409d0ac752a0ff8be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-suse \
config-chrony-pool-suse"

RDEPENDS:${PN} += "chrony"

inherit rpm

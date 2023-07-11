SUMMARY = "Chrony preconfiguration for SUSE"
DESCRIPTION = "This package configures chrony to use the SUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-suse-4.3-2.4.noarch.rpm"
RPM_HASH = "20664152d962072876856656a1407ad40b0f530a0dda4480c4de4c3b79749788104a8b8b44e67c83e2fc90fe96a5349908c2017e6a7aef62589dbf96ffa3928d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-suse \
config-chrony-pool-suse"

RDEPENDS:${PN} += "chrony"

inherit rpm

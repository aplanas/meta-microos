SUMMARY = "Chrony preconfiguration for SUSE"
DESCRIPTION = "This package configures chrony to use the SUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-suse-4.3-2.3.noarch.rpm"
RPM_HASH = "a6c53e3af0d3ed83f98b1f0daacd4d1fa294d42bd1931532ed71f9f62feac9b80732b976dad1d2867c0f120077d95081b187c89594fbce5929b99b80eb4fb26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-suse \
config(chrony-pool-suse)"

RDEPENDS:${PN} += "chrony"

inherit rpm

SUMMARY = "Chrony preconfiguration for openSUSE"
DESCRIPTION = "This package configures chrony to use the openSUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-openSUSE-4.3-2.3.noarch.rpm"
RPM_HASH = "b18884b500354207ed9df135d6c03efbe35b0b93390e505c9fca4ad7349e5d6bd7ad748f58a1ee7d9e6720a0459d8ba58da7de725e2434d4e17d3cc5afd58a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool chrony-pool-nonempty chrony-pool-openSUSE config(chrony-pool-openSUSE)"
RDEPENDS:${PN} += "chrony"

inherit rpm

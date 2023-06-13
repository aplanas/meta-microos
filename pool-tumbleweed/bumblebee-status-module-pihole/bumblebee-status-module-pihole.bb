SUMMARY = "Displays the pi-hole status"
DESCRIPTION = "Displays the pi-hole status (up/down) \
together with the number of ads that were blocked today."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-pihole-2.1.5-3.3.noarch.rpm"
RPM_HASH = "a34c922bf5766c2f3acbc61d33c59c28542e945291f534295497da2f881f5e495ed83f5658c0a81e1cf704fab0a29092c7f487b2c6779e783378ae945396044f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-pihole"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm

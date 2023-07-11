SUMMARY = "Additional tuned profiles targeted to Network Function Virtualization (NFV)"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Network Function Virtualization (NFV)."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-nfv-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "2492a8084595f08c1ec2a8a7d1ae70acb65bd1ed6de074ac0e701fc9a8a55a4aaefeb4fcc7d6ad6288f8393c82daca35963e18d49ef5fcca7edd29ca68c7ac28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned-profiles-nfv \
tuned-profiles-nfv"

RDEPENDS:${PN} += "/usr/bin/bash \
tuned"

inherit rpm

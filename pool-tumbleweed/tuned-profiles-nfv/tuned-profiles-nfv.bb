SUMMARY = "Additional tuned profiles targeted to Network Function Virtualization (NFV)"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Network Function Virtualization (NFV)."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-nfv-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "a2055e7ab771d1be76b94941e45a6ca0ea3fa8be6d488fb28890d5f4eea02128fb38175c2bdacdb2090bb14a6677db34cf0826e7486960e9e47d41121eedc04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tuned-profiles-nfv) \
tuned-profiles-nfv"

RDEPENDS:${PN} += "/bin/bash \
tuned"

inherit rpm

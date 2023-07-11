SUMMARY = "Additional tuned profiles targeted to Atomic"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Atomic host and guest."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-atomic-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "05f4d13bedd0fd950690ce775c43245f9924cfc496364953db287b3addf050a648086d2be61f4df53066f2af523fb131522febb50d0bd7ee0f1e0b9a7244563b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-atomic"

RDEPENDS:${PN} += "tuned"

inherit rpm

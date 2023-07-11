SUMMARY = "Additional tuned profiles targeted to Oracle loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon,  targeted to Oracle loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-oracle-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "312915fff25b9be628f9975a5120975faf9c9c2b76a9878e2f4709c92e475b3687ff5ee09b3b5d560d963356754b1b0d2ef7de2168dcbef0e4fd1d070b315e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-oracle"

RDEPENDS:${PN} += "tuned"

inherit rpm

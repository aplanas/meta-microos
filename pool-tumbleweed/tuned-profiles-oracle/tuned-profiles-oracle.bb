SUMMARY = "Additional tuned profiles targeted to Oracle loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon,  targeted to Oracle loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-oracle-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "1a5d8a07caab72b3e9d04016e020399713b9f4535d4af9ef1a4830c716b6609fda189cb4bb818c358a4aa12c44edca5b4042252fe551feb8ceabe58d2a2a1c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-oracle"
RDEPENDS:${PN} += "tuned"

inherit rpm

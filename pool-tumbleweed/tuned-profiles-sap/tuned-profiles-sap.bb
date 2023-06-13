SUMMARY = "Additional tuned profile(s) targeted to SAP NetWeaver loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP NetWeaver loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-sap-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "3817cf834631f2ba1201482d750d148315a17dc4a0d7f8a81eea7f6ded40ca7ae90b918299171f32fb9a26d44695a77668cf2b71321d6fc40cb1e79dc183abf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap"

RDEPENDS:${PN} += "tuned"

inherit rpm

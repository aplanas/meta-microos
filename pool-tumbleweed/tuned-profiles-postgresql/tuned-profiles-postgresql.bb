SUMMARY = "Additional tuned profile(s) targeted to PostgreSQL server loads"
DESCRIPTION = "Additional tuned profile(s) targeted to PostgreSQL server loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-postgresql-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "ac8a0ec9c013fec9190be86deba178ad6648ba5522785929ff00bad3f4e7cf0f7829b348a149aef4c28f6baba804e1c4a02da83143e96cd0753a5dd75100dfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-postgresql"

RDEPENDS:${PN} += "tuned"

inherit rpm

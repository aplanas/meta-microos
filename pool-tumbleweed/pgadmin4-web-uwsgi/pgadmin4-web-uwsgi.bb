SUMMARY = "Pgamdin4 - uwsgi configuration"
DESCRIPTION = "pgadmin4 is a management tool for PostgreSQL. \
 \
This package holds the uwsgi configuration."
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-web-uwsgi-4.30-2.10.noarch.rpm"
RPM_HASH = "ebdceab377fdb1961281b117defa56624dce3695dd560a2a9cd2f298ec3106c30b12b9601812b0689491a0632358ae8018348bb8876b0d496b09b5378db40f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pgadmin4-web-uwsgi) \
pgadmin4-web-uwsgi"
RDEPENDS:${PN} += "pgadmin4-web \
uwsgi"

inherit rpm

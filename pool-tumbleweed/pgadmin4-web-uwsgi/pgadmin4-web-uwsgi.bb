SUMMARY = "Pgamdin4 - uwsgi configuration"
DESCRIPTION = "pgadmin4 is a management tool for PostgreSQL. \
 \
This package holds the uwsgi configuration."
LICENSE = "PostgreSQL"

PV = "7.6"

RPM_NAME = "pgadmin4-web-uwsgi-7.6-1.1.noarch.rpm"
RPM_HASH = "082c693e8dc4b7a75888b6a9b49baa08ac85210c10d8e9c41b28283a64d3dd2430369c2d2f4a352052a3f5979b7093f1997b81ab22682d01c4fb7721c48d01a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4-web-uwsgi \
pgadmin4-web-uwsgi"

RDEPENDS:${PN} += "pgadmin4-web \
uwsgi"

inherit rpm

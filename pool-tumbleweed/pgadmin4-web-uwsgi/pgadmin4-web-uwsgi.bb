SUMMARY = "Pgamdin4 - uwsgi configuration"
DESCRIPTION = "pgadmin4 is a management tool for PostgreSQL. \
 \
This package holds the uwsgi configuration."
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-web-uwsgi-4.30-2.12.noarch.rpm"
RPM_HASH = "52f6348bf274a9218644511f68102074fd3b0f508aed0911a2855d8b5ddc585b087b001391fb5b6fd7e185e63f7bcb6d024aef69787412f067edffc4390da8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4-web-uwsgi \
pgadmin4-web-uwsgi"

RDEPENDS:${PN} += "pgadmin4-web \
uwsgi"

inherit rpm

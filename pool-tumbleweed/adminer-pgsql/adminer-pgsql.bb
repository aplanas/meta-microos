SUMMARY = "Dependencies required for Adminer PostgreSQL support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer PostgreSQL support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-pgsql-4.8.1-1.6.noarch.rpm"
RPM_HASH = "e197cb0357cda42638cac87b4e4528d14ceb83d3d73beee6cb112beb03ab7a6037bfd54627f39bf696d0d74640065d2fc8aca23dd4f71b5332aad27095404aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support \
adminer-pgsql"

RDEPENDS:${PN} += "adminer \
php-pgsql"

inherit rpm

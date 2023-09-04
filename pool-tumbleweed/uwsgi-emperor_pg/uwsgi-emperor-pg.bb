SUMMARY = "PostgreSQL Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) in a PostgreSQL database."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_pg-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "0fa32d2d9f9215963ba82379870f0878cd9108cb116ffba57ddac75aa59eaaacab336ce52a6d825a6ec62c9e1fde37af71a20e90a6b7e87602edfa853378eb42"

RPROVIDES:${PN} += "uwsgi-emperor-pg"

RDEPENDS:${PN} += "libc.so.6 \
libpq.so.5 \
uwsgi"

inherit rpm

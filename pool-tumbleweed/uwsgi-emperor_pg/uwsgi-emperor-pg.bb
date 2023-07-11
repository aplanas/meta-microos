SUMMARY = "PostgreSQL Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) in a PostgreSQL database."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_pg-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "a60fe09d3fa4ebbf97ecca4a4fd7281e544ece5e4cc834bed5279038741c936b22f885dc4f1a8d28f2607bb4a6996361ffd25475dfedb61eeadaf0bf16d29cc9"

RPROVIDES:${PN} += "uwsgi-emperor-pg"

RDEPENDS:${PN} += "libc.so.6 \
libpq.so.5 \
uwsgi"

inherit rpm

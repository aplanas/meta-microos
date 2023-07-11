SUMMARY = "PostgreSQL output target for ulogd"
DESCRIPTION = "PostgreSQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "ulogd-pgsql-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "c53eec98ae379a15fc16eb4b12dea3d533f3f8870ba07af6cd8ba482b9bfec7c11f1fb655dcba41bbf85fc854ab34c5dca8d2969be65f457fa022146eeea1c60"

RPROVIDES:${PN} += "ulogd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
ulogd"

inherit rpm

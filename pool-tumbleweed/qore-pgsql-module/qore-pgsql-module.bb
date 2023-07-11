SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL DBI driver module for the Qore Programming Language. The PostgreSQL \
driver is character set aware, supports multithreading, transaction management, \
stored prodedure and function execution, etc."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-3.2.0-2.4.aarch64.rpm"
RPM_HASH = "c38c5c1f2a4d0c8d7ce4bb84111d6c93fb7fc90386be1226f9686a84c028fa18c9781fa539404aa9f44eb4c1a665b9be8f4a583198f32373a8dc4235386c5045"

RPROVIDES:${PN} += "qore-pgsql-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm

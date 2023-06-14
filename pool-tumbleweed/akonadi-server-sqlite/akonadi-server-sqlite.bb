SUMMARY = "akonadi server's SQlite plugin"
DESCRIPTION = "Akonadi server's SQlite plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-sqlite-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f0e6c7ad3515eb149d781111e1df73acfa2e8ec2ceae5e85ec20fccf96f3f9c3f820a37bf40c714096045ceb382e0fcd17e81c93a8b48f58efb26a9a3d514ea5"

RPROVIDES:${PN} += "akonadi-server-sqlite \
libqsqlite3.so"

RDEPENDS:${PN} += "akonadi-server \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm

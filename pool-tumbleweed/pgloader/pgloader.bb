SUMMARY = "Fast data loader for PostgreSQL"
DESCRIPTION = "pgloader imports data from different kind of sources and COPY it into \
PostgreSQL. \
 \
The command language is described in the manual page and allows to describe \
where to find the data source, its format, and to describe data processing \
and transformation. \
 \
Supported source formats include SQL Server, CSV, fixed width flat files, \
dBase3 files (DBF), and SQLite and MySQL databases. In most of those formats, \
pgloader is able to auto-discover the schema and create the tables and the \
indexes in PostgreSQL. In the MySQL case it's possible to edit CASTing rules \
from the pgloader command directly."
LICENSE = "PostgreSQL"

PV = "3.6.9"

RPM_NAME = "pgloader-3.6.9-1.5.aarch64.rpm"
RPM_HASH = "6c910b14d58953ae418c69c59a51ddd25772796a48176cdcc05a7aaf58967e8e7fd156c0d91b72366cfc6bb22a95c8cbc8707e6fae4da470fa514909307e0d81"

RPROVIDES:${PN} += "pgloader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm

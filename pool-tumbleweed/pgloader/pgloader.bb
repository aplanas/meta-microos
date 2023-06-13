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

RPM_NAME = "pgloader-3.6.9-1.3.aarch64.rpm"
RPM_HASH = "e36d4a26bfeb269f1168bb2a307a19ad229834721e77db82a5836b19db32beae1b609cfa153f75278b89864135659ce11ff1c65196946b20951d8558bde80b96"

RPROVIDES:${PN} += "pgloader \
pgloader(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm

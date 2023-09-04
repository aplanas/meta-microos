SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-server-15-2.12.noarch.rpm"
RPM_HASH = "782d3b4faeb483ed756fa705157ce71805abdf16dd56cde5667951e7ff5aee1a81a97cc9996bf8fb13a5200c27332d5352c6e94595ba903897c1c9bb5493cb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postgresql-server \
group-postgres \
postgresql-init \
postgresql-server \
postgresql-server-noarch \
user-postgres"

RDEPENDS:${PN} += "/usr/bin/sh \
postgresql \
postgresql-server-implementation \
systemd \
sysuser-shadow"

inherit rpm

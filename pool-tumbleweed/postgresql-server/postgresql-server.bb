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

RPM_NAME = "postgresql-server-15-2.7.noarch.rpm"
RPM_HASH = "a2fc1124a73762ef2a83fe1085b28240557633899df54344fc985758d6ea9e7000bc9262ca202e2047c1bc6e616fa25127b4dcaf4a5e581198a0ec07f9a0696f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postgresql-server \
group-postgres \
postgresql-init \
postgresql-server \
postgresql-server-noarch \
user-postgres"

RDEPENDS:${PN} += "/bin/sh \
postgresql \
postgresql-server-implementation \
systemd \
sysuser-shadow"

inherit rpm

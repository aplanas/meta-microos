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

RPM_NAME = "postgresql-server-15-2.10.noarch.rpm"
RPM_HASH = "55d078d8880105ff522de21bcf2eedd193023ddc1fedbd851bd368ddc9b328f7a06d52cdfb96f4970326245eeaa1e4e373b063bcbf6234274b509619d1983f4a"
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

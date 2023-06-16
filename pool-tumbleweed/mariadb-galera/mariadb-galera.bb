SUMMARY = "The configuration files and scripts for galera replication"
DESCRIPTION = "This package contains configuration files and scripts that are \
needed for running MariaDB Galera Cluster."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-galera-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "bd526e6b6b0ddffa97e3b6d67bdce0adf9a1699c63cfbe30f538161c9a8d7dc6875ba0ea13eb42506c6eb5fe2a2e707aa3214b93e75b738ea91e4914c6c1f2e0"

RPROVIDES:${PN} += "config-mariadb-galera \
mariadb-galera"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
galera-4 \
iproute2 \
lsof \
mariadb \
rsync \
socat \
which"

inherit rpm

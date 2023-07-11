SUMMARY = "The configuration files and scripts for galera replication"
DESCRIPTION = "This package contains configuration files and scripts that are \
needed for running MariaDB Galera Cluster."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-galera-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "a57408959fcf43e0dcc2dde126ce5fe24a691c6fa898da58909899f1a86af2e82eefb07fa19d825bd82e4e824b5150643e76b3f0b49705cd9de523ce8ef3f207"

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

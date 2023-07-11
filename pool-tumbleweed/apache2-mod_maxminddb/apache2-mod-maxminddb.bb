SUMMARY = "MaxMind DB Apache Module"
DESCRIPTION = "This module allows you to query MaxMind DB files from Apache 2.2+ using the libmaxminddb library."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "apache2-mod_maxminddb-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "b353aa40eeed9515b4c9bac4276fab13314e78ab52e431c72e2798698ad7c01c479e8df054ca04cc476a986070b8ba229c7538c641b49e2f7883d1ee333fb153"

RPROVIDES:${PN} += "apache2-mod-maxminddb \
config-apache2-mod-maxminddb"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
suse-maintenance-mmn-0"

inherit rpm

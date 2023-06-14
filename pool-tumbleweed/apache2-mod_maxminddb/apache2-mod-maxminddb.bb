SUMMARY = "MaxMind DB Apache Module"
DESCRIPTION = "This module allows you to query MaxMind DB files from Apache 2.2+ using the libmaxminddb library."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "apache2-mod_maxminddb-1.2.0-1.13.aarch64.rpm"
RPM_HASH = "f1f53e1b810d1ac15a67b402d06a259112e3b51ab13363be5fcdf7c163b4f05686a0f1448a94abfbda429e10f69cf2f93d142dd753f1aeddf1706c3e87122179"

RPROVIDES:${PN} += "apache2-mod-maxminddb \
config-apache2-mod-maxminddb"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
suse-maintenance-mmn-0"

inherit rpm

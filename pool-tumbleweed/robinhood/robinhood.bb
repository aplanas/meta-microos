SUMMARY = "Policy engine and reporting tool for large filesystems"
DESCRIPTION = "The Robinhood Policy Engine is a tool to manage contents of large \
file systems. It maintains a replicate of filesystem medatada in a \
database that can be queried at will. It makes it possible to \
schedule mass action on filesystem entries by defining \
attribute-based policies, provides fast 'find' and 'du' enhanced \
clones, gives to administrators an overall view of filesystem \
contents through its web UI and command line tools. \
 \
It supports any POSIX filesystem and implements advanced features for \
Lustre filesystems (list/purge files per OST or pool, read MDT \
changelogs...)"
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-3.1.7-2.2.aarch64.rpm"
RPM_HASH = "9c3e19dfdb2259ea1e5d759c87cfded10c7a8677223c31f07d1ef86bd2cbcddfc95bfcf9ab5596a096ee2430a749064a9b3358aafc47b3fde756cf3ec450a048"

RPROVIDES:${PN} += "librbh-mod-alerter.so \
librbh-mod-basic.so \
librbh-mod-checker.so \
librbh-mod-common.so \
librbh-mod-modeguard.so \
librbh-mod-test.so \
robinhood"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjemalloc.so.2 \
libmariadb.so.3 \
libz.so.1 \
systemd \
which"

inherit rpm

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

RPM_NAME = "robinhood-3.1.7-2.1.aarch64.rpm"
RPM_HASH = "ba85582d731beb5d418baf9a7a1d06039dd91af267f5764aa67589c421155ce434cd8b4db2cc7ac9ed72f8f62d1e742b95d78d883d06d899f4c7de72eb86f34d"

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

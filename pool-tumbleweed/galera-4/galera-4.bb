SUMMARY = "Galera: a synchronous multi-master wsrep provider (replication engine)"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
Copyright 2007-2015 Codership Oy. All rights reserved. Use is subject to license terms under GPLv2 license. \
 \
This software comes with ABSOLUTELY NO WARRANTY. This is free software, \
and you are welcome to modify and redistribute it under the GPLv2 license."
LICENSE = "GPL-2.0-only"

PV = "26.4.14"

RPM_NAME = "galera-4-26.4.14-1.1.aarch64.rpm"
RPM_HASH = "bca095b1403296df52885acacfe966cbe3338f3136388ba0e1650b2643247b30a998dea04d1fc61919777dd8015e7816ad4a49e3e606576c1abfef21dfd48336"

RPROVIDES:${PN} += "config-galera-4 \
galera-4 \
group-garb \
user-garb"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
galera-4-wsrep-provider \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm

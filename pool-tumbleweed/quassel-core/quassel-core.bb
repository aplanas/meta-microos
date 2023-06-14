SUMMARY = "Core program for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This is the core only."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-core-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "041ac991a8bf15c9641408fc0e1d7a438699f6c6f3e82d3888ae004b92eb1184ea73d4121edc82f6cd78b19cdf9625fada764feab6c24febe24e15acf214a6d9"

RPROVIDES:${PN} += "config-quassel-core \
quassel-core"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libldap.so.2 \
libqca-qt5.so.2 \
libqt5-sql-backend \
libstdc++.so.6 \
libz.so.1 \
logrotate \
shadow"

inherit rpm

SUMMARY = "Ethernet Bridge Tables"
DESCRIPTION = "A firewalling tool to transparently filter network traffic passing a \
bridge. The filtering possibilities are limited to link layer filtering \
and some basic filtering on higher network layers. The ebtables tool \
can be used together with the other Linux filtering tools, like \
iptables. There are no incompatibility issues."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "ebtables-2.0.11-5.7.aarch64.rpm"
RPM_HASH = "b4bef4f4c67b855a5de5b7bdac6ce32492a3086bb92118e77bd9fb727c927fc28a1dedeb4abf4d01a7972c5ff0c1ece8094e095704fd57f6c3350f6849180208"

RPROVIDES:${PN} += "ebtables"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
alts \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebtc.so.0 \
libnss-usrfiles2 \
netcfg"

inherit rpm

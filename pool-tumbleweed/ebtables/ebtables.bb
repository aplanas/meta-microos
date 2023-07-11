SUMMARY = "Ethernet Bridge Tables"
DESCRIPTION = "A firewalling tool to transparently filter network traffic passing a \
bridge. The filtering possibilities are limited to link layer filtering \
and some basic filtering on higher network layers. The ebtables tool \
can be used together with the other Linux filtering tools, like \
iptables. There are no incompatibility issues."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "ebtables-2.0.11-5.8.aarch64.rpm"
RPM_HASH = "a1dd9f398185254a0755070dd5dca54245ad410c7aafa2dfb89f26020c58fb438de4eeae2125fc6e3a2b51700dc8d36efec86b50568c769c3f0b90beb3b5947a"

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

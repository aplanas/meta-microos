SUMMARY = "Userspace logging for Netfilter"
DESCRIPTION = "ulogd is a userspace logging daemon for netfilter/iptables related \
logging. This includes per-packet logging of security violations, \
per-packet logging for accounting purpose as well as per-flow \
logging."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "ulogd-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "560a04057675399e682883c41fca73bf48d291c4e35243365b25d71beca22cfe78ca1cbaea3d5e0c80f3a2653693508ce96e3063b45c8e60225f3c7c59c40c40"

RPROVIDES:${PN} += "config-ulogd \
group-ulogd \
ulogd \
user-ulogd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-acct.so.1 \
libnetfilter-conntrack.so.3 \
libnetfilter-log.so.1 \
libnfnetlink.so.0 \
sysuser-shadow"

inherit rpm

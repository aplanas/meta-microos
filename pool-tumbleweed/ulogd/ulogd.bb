SUMMARY = "Userspace logging for Netfilter"
DESCRIPTION = "ulogd is a userspace logging daemon for netfilter/iptables related \
logging. This includes per-packet logging of security violations, \
per-packet logging for accounting purpose as well as per-flow \
logging."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "c51c984412b8f88949c453584aa8c1a3d96c9059a776ce8e3a2e16e0eb5947aeaaefdde183b7b6a096324f9c6ad7cbfc8f6685716b1f843a76f20d7b384ad8f3"

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

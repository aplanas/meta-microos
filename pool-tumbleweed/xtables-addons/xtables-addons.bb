SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24"

RPM_NAME = "xtables-addons-3.24-1.9.aarch64.rpm"
RPM_HASH = "97772a0713593e3c571c6c7fb44af09d8ee64cbcf2792952af6c3e677e6fd018b1b5854b31cc05e93294c486dc3d709d4bbccf32e8013f8f46757c243b4d0718"

RPROVIDES:${PN} += "libxt-ACCOUNT-cl.so.1 \
libxt-ACCOUNT.so \
libxt-CHAOS.so \
libxt-DELUDE.so \
libxt-DHCPMAC.so \
libxt-DNETMAP.so \
libxt-ECHO.so \
libxt-IPMARK.so \
libxt-LOGMARK.so \
libxt-PROTO.so \
libxt-SYSRQ.so \
libxt-TARPIT.so \
libxt-asn.so \
libxt-condition.so \
libxt-dhcpmac.so \
libxt-fuzzy.so \
libxt-geoip.so \
libxt-gradm.so \
libxt-iface.so \
libxt-ipp2p.so \
libxt-ipv4options.so \
libxt-length2.so \
libxt-lscan.so \
libxt-pknock.so \
libxt-psd.so \
libxt-quota2.so \
xtables-addons"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxtables.so.12 \
perl-Getopt--Long \
perl-Net--CIDR--Lite \
perl-Socket \
perl-Text--CSV-XS \
perl-strict \
perl-warnings"

inherit rpm

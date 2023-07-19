SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24"

RPM_NAME = "xtables-addons-3.24-1.11.aarch64.rpm"
RPM_HASH = "368825182aa79879dafd8bdb6f691d695800dbf816c392afa21f5c72076e72ced7a3548bb5feb2e25d6b0946fbb493086623cec402196708e3305ee5a90c6bf2"

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

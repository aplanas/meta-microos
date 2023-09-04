SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.25"

RPM_NAME = "xtables-addons-3.25-1.1.aarch64.rpm"
RPM_HASH = "35706481a421f9aa7c2d814c11a46ee98c5ef48ae8c88df6a1c9e0e88f8e2258692ee0ab353872b19cb4d101deb31824fe064928d6f7c68788cd0b0a9c24e29d"

RPROVIDES:${PN} += "libxt-ACCOUNT-cl.so.1 \
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

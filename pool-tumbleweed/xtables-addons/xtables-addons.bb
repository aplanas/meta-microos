SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24"

RPM_NAME = "xtables-addons-3.24-1.3.aarch64.rpm"
RPM_HASH = "1f121d8ed875b97b21bf035826030658b9681a523df9315deb6d7b5bfeebb89b5416a287137d05c87909aaf1ae802b6d09569508b2cd72308c32157dadd9ecd5"

RPROVIDES:${PN} += "libxt_ACCOUNT.so()(64bit) \
libxt_ACCOUNT_cl.so.1()(64bit) \
libxt_CHAOS.so()(64bit) \
libxt_DELUDE.so()(64bit) \
libxt_DHCPMAC.so()(64bit) \
libxt_DNETMAP.so()(64bit) \
libxt_ECHO.so()(64bit) \
libxt_IPMARK.so()(64bit) \
libxt_LOGMARK.so()(64bit) \
libxt_PROTO.so()(64bit) \
libxt_SYSRQ.so()(64bit) \
libxt_TARPIT.so()(64bit) \
libxt_asn.so()(64bit) \
libxt_condition.so()(64bit) \
libxt_dhcpmac.so()(64bit) \
libxt_fuzzy.so()(64bit) \
libxt_geoip.so()(64bit) \
libxt_gradm.so()(64bit) \
libxt_iface.so()(64bit) \
libxt_ipp2p.so()(64bit) \
libxt_ipv4options.so()(64bit) \
libxt_length2.so()(64bit) \
libxt_lscan.so()(64bit) \
libxt_pknock.so()(64bit) \
libxt_psd.so()(64bit) \
libxt_quota2.so()(64bit) \
xtables-addons \
xtables-addons(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxtables.so.12()(64bit) \
perl(Getopt::Long) \
perl(Net::CIDR::Lite) \
perl(Socket) \
perl(Text::CSV_XS) \
perl(strict) \
perl(warnings)"

inherit rpm

SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24_k6.4.6_1"

RPM_NAME = "xtables-addons-kmp-64kb-3.24_k6.4.6_1-1.13.aarch64.rpm"
RPM_HASH = "18bae0cee67f1a61414f9c02913b0171515609ed3768ec2a2eb1c9afac0a754c376d51b725796b3f09cbedac364aa460fa88be9fd8e4de71980961bcce331ac2"

RPROVIDES:${PN} += "kmod-compat-xtables.ko \
kmod-xt-ACCOUNT.ko \
kmod-xt-CHAOS.ko \
kmod-xt-DELUDE.ko \
kmod-xt-DHCPMAC.ko \
kmod-xt-DNETMAP.ko \
kmod-xt-ECHO.ko \
kmod-xt-IPMARK.ko \
kmod-xt-LOGMARK.ko \
kmod-xt-PROTO.ko \
kmod-xt-SYSRQ.ko \
kmod-xt-TARPIT.ko \
kmod-xt-asn.ko \
kmod-xt-condition.ko \
kmod-xt-fuzzy.ko \
kmod-xt-geoip.ko \
kmod-xt-iface.ko \
kmod-xt-ipp2p.ko \
kmod-xt-ipv4options.ko \
kmod-xt-length2.ko \
kmod-xt-lscan.ko \
kmod-xt-pknock.ko \
kmod-xt-psd.ko \
kmod-xt-quota2.ko \
multiversion-kernel \
xtables-addons-kmp \
xtables-addons-kmp-64kb \
xtables-addons-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm

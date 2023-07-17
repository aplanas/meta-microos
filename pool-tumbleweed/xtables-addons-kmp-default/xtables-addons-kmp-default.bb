SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24_k6.4.2_1"

RPM_NAME = "xtables-addons-kmp-default-3.24_k6.4.2_1-1.10.aarch64.rpm"
RPM_HASH = "c77dbaa68d8116f8d5b4e1c734267b479294154b8e8e0207d01fbe52fc69cd03b841e8be9546f159ca053f115f46228b52657d2cc911b19a994a5c6ac0d72e30"

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
xtables-addons-kmp-default \
xtables-addons-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm

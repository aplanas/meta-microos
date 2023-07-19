SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24_k6.4.3_1"

RPM_NAME = "xtables-addons-kmp-64kb-3.24_k6.4.3_1-1.11.aarch64.rpm"
RPM_HASH = "1d01d5dd7cfea8db20a7d5e0ec508fa1a34c0e78d7084f4ae4c71cc95c2e61fc9c3fbe63d946e07c79e828b1de61b51896a0efc6a470b69f263f2837a4711f59"

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
xtables-addons-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm

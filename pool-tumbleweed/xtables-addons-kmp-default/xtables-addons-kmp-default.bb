SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.25_k6.4.11_1"

RPM_NAME = "xtables-addons-kmp-default-3.25_k6.4.11_1-1.1.aarch64.rpm"
RPM_HASH = "f72f5ce5c4f65be5c658996c43a070c603e0e32bb8cade0f4fd82d197742866456c2f4642539fa72852dc51d8665870f9db3e5a881beca26d515104567e1a212"

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
xtables-addons-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm

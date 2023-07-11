SUMMARY = "A keepalive facility for Linux"
DESCRIPTION = "This project provides facilities for load balancing and high-availability to \
Linux system and Linux-based infrastructures. The load-balancing framework \
relies on the Linux Virtual Server (IPVS) kernel module providing Layer4 load \
balancing.  Keepalived implements a set of checkers to dynamically and \
adaptively maintain and manage loadbalanced server pool according their health. \
High-availability is achieved by the VRRP protocol, a fundamental brick for \
router failover. In addition, Keepalived implements a set of hooks to the VRRP \
finite state machine, providing low-level and high-speed protocol interactions. \
Keepalived frameworks can be used independently or all together to provide \
resilient infrastructures."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.8"

RPM_NAME = "keepalived-2.2.8-1.2.aarch64.rpm"
RPM_HASH = "123d48b6da59a563343a40e4fa62825d19a59ff4e5cef5309e386e088513f72a2960455270c0bd64b9e667b429e986381222790d79518e4075929ade602cfaf4"

RPROVIDES:${PN} += "config-keepalived \
keepalived"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libmagic.so.1 \
libmnl.so.0 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmpmibs.so.40 \
libnftnl.so.11 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpcre2-8.so.0 \
libssl.so.3 \
libsystemd.so.0 \
pwdutils"

inherit rpm

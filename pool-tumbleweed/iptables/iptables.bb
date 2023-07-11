SUMMARY = "IP packet filter administration utilities"
DESCRIPTION = "iptables is used to set up, maintain, and inspect the rule tables of \
the various Netfilter packet filter engines inside the Linux kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "iptables-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "8a449c29e5099d61d5e2899487935655a63902d0a3ea7a48fc86671af72c723d98a1bd8ca0503aeb2ae1a5afd8c2f484796add60f17bbb193a28689cdbae32b7"

RPROVIDES:${PN} += "iptables"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libip4tc.so.2 \
libip6tc.so.2 \
libmnl.so.0 \
libnftnl.so.11 \
libnss-usrfiles2 \
libxtables.so.12 \
netcfg \
xtables-plugins"

inherit rpm

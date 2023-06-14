SUMMARY = "IP packet filter administration utilities"
DESCRIPTION = "iptables is used to set up, maintain, and inspect the rule tables of \
the various Netfilter packet filter engines inside the Linux kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "iptables-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "3f5a6ff6b5eec6a62a0b456aa0a3db1d86dc0fbbeb466eccd8cfa1cde59e1c2850eaf3ea0ccd505438b70aeca0f36b102b93847a4a52a3c35b1cd85ea53002cc"

RPROVIDES:${PN} += "iptables"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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

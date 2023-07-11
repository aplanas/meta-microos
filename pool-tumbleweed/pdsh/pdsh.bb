SUMMARY = "Parallel remote shell program"
DESCRIPTION = "Pdsh is a multithreaded remote shell client which executes commands on \
multiple remote hosts in parallel.  Pdsh can use several different \
remote shell services, including Kerberos IV and ssh."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-2.34-12.1.aarch64.rpm"
RPM_HASH = "239492f178b4c15d3f52eeac98867f74fdffd4ff74ba5765a17906fff6b5189df09c0b7d2e30d8f924e0dcab79d4829d1808bc5cb026cbee139ef155cf495eab"

RPROVIDES:${PN} += "pdsh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
libreadline.so.8"

inherit rpm

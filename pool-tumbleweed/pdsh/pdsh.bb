SUMMARY = "Parallel remote shell program"
DESCRIPTION = "Pdsh is a multithreaded remote shell client which executes commands on \
multiple remote hosts in parallel.  Pdsh can use several different \
remote shell services, including Kerberos IV and ssh."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-2.34-10.2.aarch64.rpm"
RPM_HASH = "9ee0c610c65c42c138a4f2bf7e1fbbf4029077b37a1a735135beac401d71e39ee9214bb76fa8f505ba2e1d448215844649608cd28bfcd223d4079acd78a79785"

RPROVIDES:${PN} += "pdsh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
libreadline.so.8"

inherit rpm

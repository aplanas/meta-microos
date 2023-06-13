SUMMARY = "Unix Mail Handler"
DESCRIPTION = "nmh (new MH) is a powerful electronic mail handling system. It was \
originally based on version 6.8.3 of the MH message system developed by \
the RAND Corporation and the University of California. It is intended \
to be a (mostly) compatible drop-in replacement for MH. \
 \
nmh consists of a collection of fairly simple single-purpose programs \
to send, receive, save, retrieve, and manipulate e-mail messages. \
Because nmh is a suite rather than a single monolithic program, you may \
freely intersperse nmh commands with other commands at your shell \
prompt or write custom scripts that use these commands in flexible \
ways."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "nmh-1.7.1-1.18.aarch64.rpm"
RPM_HASH = "954f3006fce5e7376ff42cc2c766edfa9f4847eb196c5094041d70157a6d438569bd590a16fb66ceeb7912a384b0c3871967a4201ed2a111a1183b0fb87daedb"

RPROVIDES:${PN} += "config(nmh) \
mh \
nmh \
nmh(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
less \
libc.so.6()(64bit) \
libgdbm_compat.so.4()(64bit) \
libtinfo.so.6()(64bit) \
smtp_daemon"

inherit rpm

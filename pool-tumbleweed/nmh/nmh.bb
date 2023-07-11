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

RPM_NAME = "nmh-1.7.1-1.19.aarch64.rpm"
RPM_HASH = "5d09a06d2244dd33b7093bb0d58a229e796cf7e92f2855336c8cd6785e0b66d711d3694afd46a56f3b4a2d13dba09d4b2b4f2db7a2b4c3ff3501bc07615b63ad"

RPROVIDES:${PN} += "config-nmh \
mh \
nmh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libgdbm-compat.so.4 \
libtinfo.so.6 \
smtp-daemon"

inherit rpm

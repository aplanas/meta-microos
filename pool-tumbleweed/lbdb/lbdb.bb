SUMMARY = "Address Database for mutt"
DESCRIPTION = "The Little Brother's Database (lbdb) consists of a set of small tools \
that collect mail addresses from several sources and offer these \
addresses to the external query feature of the Mutt mail reader. \
 \
To use the fetch address feature, put the following lines in your \
.procmailrc: \
 \
:0hc | lbdb-fetchaddr \
 \
To use the database in mutt, put the following line into your .muttrc: \
 \
set query_command='lbdbq %{s}'"
LICENSE = "GPL-2.0-or-later"

PV = "0.52.1"

RPM_NAME = "lbdb-0.52.1-1.1.aarch64.rpm"
RPM_HASH = "6ff2e781f97b2b0ab8c4c7dee90154d2bf3a6acd0da183317f752d9fd2d3757cd4bb1d69dbf5707c13a5f6d0af2a464889189eb98ebd4d7e7491749a0d51027f"

RPROVIDES:${PN} += "config-lbdb \
lbdb"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

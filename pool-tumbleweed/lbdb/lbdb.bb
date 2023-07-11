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

PV = "0.51.1"

RPM_NAME = "lbdb-0.51.1-1.1.aarch64.rpm"
RPM_HASH = "80dc0ca81f963f82ea32b7bfaa8ece2af91d79b81f9ad18aeee945dc1a0d79bb12591d07019423e8570d41060bb6aea39e8246967ffbfef18d763021195c0faf"

RPROVIDES:${PN} += "config-lbdb \
lbdb"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

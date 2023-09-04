SUMMARY = "Performance Co-Pilot (PCP) development tools and documentation"
DESCRIPTION = "Performance Co-Pilot (PCP) documentation and tools for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-devel-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fab04a0786990595504981cfcde935cee9be1d6348946adbd9e8fbf90fb4b50170f3835f2feaa1f14ecd73d1485aba543a66eee6440d352db3104e898e328ac3"

RPROVIDES:${PN} += "config-pcp-devel \
pcp-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm

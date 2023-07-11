SUMMARY = "Perl support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Perl support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-perl-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "aabc273e856b36de743fe61f19ef6e3f02e31c5175e42259e5f5cdd9547bda6c9a49a8b357e976efefab31cd6d3f494801603612acca8da918197ca595a365c2"

RPROVIDES:${PN} += "config-freeradius-server-perl \
freeradius-server-perl"

RDEPENDS:${PN} += "freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl"

inherit rpm

SUMMARY = "Perl support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Perl support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-perl-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "df02c7be94974e755a45b8dbc767f263b677bbf06344f1188fbae53c88b0dd558859bad329a4695bfb0731d7927016c8550a9f22993b229fc6627d93ed6d14cb"

RPROVIDES:${PN} += "config-freeradius-server-perl \
freeradius-server-perl"

RDEPENDS:${PN} += "freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl"

inherit rpm

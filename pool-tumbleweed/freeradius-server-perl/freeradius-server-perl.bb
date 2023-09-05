SUMMARY = "Perl support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Perl support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-perl-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "15012ca9763049ea6de64ec45384d3fed7e10830e2e1b516d03527f38d1e2b4e929cbf112011794affc47cf89a7664d85a52cea0497f19645fe264d0fab68149"

RPROVIDES:${PN} += "config-freeradius-server-perl \
freeradius-server-perl"

RDEPENDS:${PN} += "freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl"

inherit rpm

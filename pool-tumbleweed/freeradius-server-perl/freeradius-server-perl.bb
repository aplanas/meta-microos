SUMMARY = "Perl support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Perl support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-perl-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "1ddb986a8ef423d4f3ee3fb3e4b53e6cbeeba3b852c897dd96eab024aece9b5db4fd431dcd7c6e108bbf6d2db3b25b635f184c35dd73b5d220b5b8dcca9bf11f"

RPROVIDES:${PN} += "config(freeradius-server-perl) \
freeradius-server-perl \
freeradius-server-perl(aarch-64)"

RDEPENDS:${PN} += "freeradius-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libperl.so()(64bit) \
perl"

inherit rpm

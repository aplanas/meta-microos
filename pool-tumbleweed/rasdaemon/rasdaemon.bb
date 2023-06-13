SUMMARY = "Utility to receive RAS error tracings"
DESCRIPTION = "rasdaemon is a RAS (Reliability, Availability and Serviceability) logging tool. \
It currently records memory errors, using the EDAC tracing events. \
EDAC is drivers in the Linux kernel that handle detection of ECC errors \
from memory controllers for most chipsets on i386 and x86_64 architectures. \
EDAC drivers for other architectures like arm also exists. \
This userspace component consists of an init script which makes sure \
EDAC drivers and DIMM labels are loaded at system startup, as well as \
an utility for reporting current error counts from the EDAC sysfs files."
LICENSE = "GPL-2.0-only"

PV = "0.7.0.7.git+24204af"

RPM_NAME = "rasdaemon-0.7.0.7.git+24204af-1.2.aarch64.rpm"
RPM_HASH = "40409b04aff9012540a7b2e0c8573a8e969e4ad85113972dc5e10fc63ff429599d004b0287d1d5797fb787dbca6e3f84f6bc7df28b478e973a96bc2cf5a027da"

RPROVIDES:${PN} += "rasdaemon \
rasdaemon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
dmidecode \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsqlite3.so.0()(64bit) \
libtraceevent.so.1()(64bit) \
perl-DBD-SQLite"

inherit rpm

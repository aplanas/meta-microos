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

RPM_NAME = "rasdaemon-0.7.0.7.git+24204af-1.3.aarch64.rpm"
RPM_HASH = "5d788844aba480acffb618a5ffaf7a27667cfe4dfeecd3fae4fb2d2822da73c8043ca2e8f215851f58a51de88d011c3fd1974dae208e4d006428d00af4cffa90"

RPROVIDES:${PN} += "rasdaemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
dmidecode \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libtraceevent.so.1 \
perl-DBD-SQLite"

inherit rpm

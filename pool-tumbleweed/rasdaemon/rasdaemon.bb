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

PV = "0.8.0.10.git+a247baf"

RPM_NAME = "rasdaemon-0.8.0.10.git+a247baf-1.1.aarch64.rpm"
RPM_HASH = "7fb94ab49b7014883b4b3ada5c793361016ab7912a0e67da34ec4ce3ba93e5333261bd37a9a1dd464559c88bbb67c178c90a80228fab0a83b7fa97435d5d2e53"

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

SUMMARY = "Performance Application Programming Interface"
DESCRIPTION = " \
PAPI aims to provide the tool designer and application engineer with a \
consistent interface and methodology for use of the performance counter \
hardware found in most major microprocessors. PAPI enables software \
engineers to see, in near real time, the relation between software \
performance and processor events."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "3ec6f0984407e8db6f6179cf27cf62435154514220c45bd5a5109f9ab93007e83213391c58253f1ef9ae27b2b5524061cb56aa2ea74100c7d98f3708ef89bd44"

RPROVIDES:${PN} += "papi \
papi(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm

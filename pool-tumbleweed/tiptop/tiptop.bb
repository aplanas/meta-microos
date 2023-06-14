SUMMARY = "Performance monitoring tool using hardware counters"
DESCRIPTION = "Tiptop is a performance monitoring tool for Linux. It provides a dynamic \
real-time view of the tasks running in the system. Tiptop is very similar \
to the top utility, but most of the information displayed comes from \
hardware counters."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "tiptop-2.3.1-3.5.aarch64.rpm"
RPM_HASH = "2e65b706a0243e506581ad1882e8468b6f3a52126c3c86c4ee14f2346eb86a2530944bd65b38a66ed4b735c7ba438d3dd39f9ba87dc59a43857f18b840cda8ab"

RPROVIDES:${PN} += "tiptop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm

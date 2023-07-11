SUMMARY = "Performance monitoring tool using hardware counters"
DESCRIPTION = "Tiptop is a performance monitoring tool for Linux. It provides a dynamic \
real-time view of the tasks running in the system. Tiptop is very similar \
to the top utility, but most of the information displayed comes from \
hardware counters."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "tiptop-2.3.1-3.6.aarch64.rpm"
RPM_HASH = "2a25fc4b3e409dc6ad71cc752d28bfe5fa10954419589c811d7edc645b03c2686b11802c4d51cee0c6aa69e81ed487226382351c3ccf9a51ba2392e6cff78f82"

RPROVIDES:${PN} += "tiptop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm

SUMMARY = "Daemon to balance IRQs on SMP machines"
DESCRIPTION = "irqbalance dynamically switches the CPUs for IRQs to prevent cpu0 from \
being used for all IRQs."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.2.24.git+184c950"

RPM_NAME = "irqbalance-1.9.2.24.git+184c950-1.1.aarch64.rpm"
RPM_HASH = "81e1b167a39276cd0135f31ff877085f5d236220a5ca6773346232c3fab61e2d9f8537dcbcb540741b599079e0d32842f4a4a311d801504b8e5857c562461b09"

RPROVIDES:${PN} += "irqbalance"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libm.so.6 \
libnuma.so.1"

inherit rpm

SUMMARY = "Management library for 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table)."
LICENSE = "LGPL-2.1-only"

PV = "76"

RPM_NAME = "libndctl6-76-1.4.aarch64.rpm"
RPM_HASH = "9489910ca9200c55417d05dcc2b0d1ee45637a07f0845d4c0f4fd27c7d47878acebd335b3a4b943b94f20de5bcf207e4e23f83bee3b2215909fc31a4f0119a62"

RPROVIDES:${PN} += "libcxl.so.1 \
libdaxctl.so.1 \
libndctl.so.6 \
libndctl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libudev.so.1 \
libuuid.so.1"

inherit rpm

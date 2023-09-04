SUMMARY = "Management library for 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table)."
LICENSE = "LGPL-2.1-only"

PV = "78"

RPM_NAME = "libndctl6-78-1.1.aarch64.rpm"
RPM_HASH = "56267a7c88325e71d7491ada22b260fa8664a3c5d387b8d3ab11be85ce8ce3c79097ffcd2b22fec4c8e5cc63e2eb1f518895a224af83a8530cf445eea88a573a"

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

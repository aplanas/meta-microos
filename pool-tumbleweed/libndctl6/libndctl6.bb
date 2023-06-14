SUMMARY = "Management library for 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table)."
LICENSE = "LGPL-2.1-only"

PV = "76"

RPM_NAME = "libndctl6-76-1.3.aarch64.rpm"
RPM_HASH = "4e213179d1447ee4a2b86656afd63cf6ec4ac1fa5a182230e6666c041f9b1674989c5fe112ab506c0c0dc90e00dbda49a6ff13f3accfe7a82ddb63cad5dce80d"

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

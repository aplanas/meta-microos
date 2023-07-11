SUMMARY = "Manage 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, used for \
platform NVDIMM resources like those defined by the ACPI 6.0 NFIT \
(NVDIMM Firmware Interface Table)."
LICENSE = "GPL-2.0-only"

PV = "76"

RPM_NAME = "ndctl-76-1.4.aarch64.rpm"
RPM_HASH = "81462f33bab23bfc1f2c060df5600c2f6b9dbf18517d2258312f7ccac5d61c63a5f134a4f73066ae7e945380531f3a0112e7d722d98f99911f164a9d959b0f1f"

RPROVIDES:${PN} += "config-ndctl \
ndctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxl.so.1 \
libdaxctl.so.1 \
libiniparser.so.1 \
libjson-c.so.5 \
libkeyutils.so.1 \
libndctl.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libuuid.so.1 \
systemd"

inherit rpm

SUMMARY = "Manage 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, used for \
platform NVDIMM resources like those defined by the ACPI 6.0 NFIT \
(NVDIMM Firmware Interface Table)."
LICENSE = "GPL-2.0-only"

PV = "78"

RPM_NAME = "ndctl-78-1.1.aarch64.rpm"
RPM_HASH = "d5d27a667e1f5cf517d8ac84185f061fa0dc0d6566ccb579cf93099dcc94e50c4c8aaffe3a8330e7b1fa858ae781586c3a635f65e58609c48e84d9754cb941f0"

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

SUMMARY = "Manage 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, used for \
platform NVDIMM resources like those defined by the ACPI 6.0 NFIT \
(NVDIMM Firmware Interface Table)."
LICENSE = "GPL-2.0-only"

PV = "76"

RPM_NAME = "ndctl-76-1.3.aarch64.rpm"
RPM_HASH = "daa3c07ec2eace60072a4a1b0bcf5c087bb6cfa78e93314b3c7f0aae6ee411bbc3666ff014775a66a7218e7ed43690887bc52e366bd0a59ef683cbd3719f2902"

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

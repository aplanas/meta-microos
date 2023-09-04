SUMMARY = "Development files for libndctl"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table). \
 \
The ndctl-devel package contains libraries and header files for \
developing applications that use ndctl."
LICENSE = "LGPL-2.1-only"

PV = "78"

RPM_NAME = "libndctl-devel-78-1.1.aarch64.rpm"
RPM_HASH = "fe7791107e16219d8b9f6076df072e5b0cc2c50bc83530aa9f7bee649341da5351fb6248b3d4a68fcdac34438c13dc8db903ab712822941cd8f229a96408c18d"

RPROVIDES:${PN} += "libndctl-devel \
pkgconfig-libcxl \
pkgconfig-libdaxctl \
pkgconfig-libndctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndctl6"

inherit rpm

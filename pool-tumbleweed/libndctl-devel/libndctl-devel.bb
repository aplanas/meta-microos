SUMMARY = "Development files for libndctl"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table). \
 \
The ndctl-devel package contains libraries and header files for \
developing applications that use ndctl."
LICENSE = "LGPL-2.1-only"

PV = "76"

RPM_NAME = "libndctl-devel-76-1.4.aarch64.rpm"
RPM_HASH = "8db6d1994c75cab922cf70678f9e0858f1913c71682cd46581c503d84b9a12dfa9b019773b225a59ac56beaf6d61bb17b9ab5baae7345b45110a2e9c4f8179eb"

RPROVIDES:${PN} += "libndctl-devel \
pkgconfig-libcxl \
pkgconfig-libdaxctl \
pkgconfig-libndctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndctl6"

inherit rpm

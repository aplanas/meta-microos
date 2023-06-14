SUMMARY = "Development files for ldmtool"
DESCRIPTION = "Contains libraries and header files for developing applications using \
libldm."
LICENSE = "LGPL-3.0-only"

PV = "0.2.4"

RPM_NAME = "libldm-1_0-0-devel-0.2.4-2.11.aarch64.rpm"
RPM_HASH = "ef0d8f8aa5703f90e57917a919239037d7ff71333c1b34680ad70be227399194018818d48cde7c3c59c942249a9ac99ea2bef123a1e9b46ca503c44faf7933e8"

RPROVIDES:${PN} += "libldm-1-0-0-devel \
pkgconfig-ldm-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldm-1-0-0 \
pkgconfig-devmapper \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0"

inherit rpm

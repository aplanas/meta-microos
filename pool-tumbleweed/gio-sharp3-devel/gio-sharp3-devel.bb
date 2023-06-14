SUMMARY = ".NET/C-Sharp Bindings for GIO"
DESCRIPTION = "Files for developing programs that use gio-sharp"
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gio-sharp3-devel-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "584533be4ba6eefad4c4bad5ffb87de9943725ac85829da0d04f96cc4ddda2398a6f5ca55ebcca04b55eaaf1c149dbf1d5d0c5de9ad7bafa943e6a40e6da2413"

RPROVIDES:${PN} += "gio-sharp3-devel \
pkgconfig-gio-sharp-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gio-sharp3 \
pkgconfig-glib-sharp-3.0"

inherit rpm

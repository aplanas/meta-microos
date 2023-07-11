SUMMARY = "Header and library definition files for lensfun"
DESCRIPTION = "Header and library definition files for developing applications \
that use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-devel-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "03331282bed678e35363088bb094ab3e3f7431925bcff14ec76e354d7a5e854ff41abe46402c4ffd12f1292885cf9403e6db3a99d3d0f023b6ae17fd492652b6"

RPROVIDES:${PN} += "lensfun-devel \
pkgconfig-lensfun"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lensfun-data \
liblensfun1 \
pkgconfig-glib-2.0"

inherit rpm

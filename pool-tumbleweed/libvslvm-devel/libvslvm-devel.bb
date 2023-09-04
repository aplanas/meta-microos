SUMMARY = "Header files and libraries for developing applications for libvslvm"
DESCRIPTION = "Header files and libraries for developing applications for libvslvm \
 \
See libvslvm for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvslvm."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-devel-20221025-5.1.aarch64.rpm"
RPM_HASH = "ff44012579226d050a06879580c97c9bfbd84b263f02e73508ef88cdc0bbfc68467fa2e7a2a000527cd7d6b6b1c455c327c4b47fda3f99dbc63f990a14a9418a"

RPROVIDES:${PN} += "libvslvm-devel \
pkgconfig-libvslvm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvslvm1"

inherit rpm

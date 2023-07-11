SUMMARY = "Development files for libcdata, a C generic data library"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20230108"

RPM_NAME = "libcdata-devel-20230108-1.3.aarch64.rpm"
RPM_HASH = "79b1db3a575088c1afa5e28b4e4f474bf0a41d89e26cc6328556338857fcd14cc5a00efe993d8e321c6cca4decadff64f10329828504d83ffd2ac1fd46287292"

RPROVIDES:${PN} += "libcdata-devel \
pkgconfig-libcdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdata1"

inherit rpm

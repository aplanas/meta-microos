SUMMARY = "Development files for cal3d"
DESCRIPTION = "This package contains libraries, include files, and other resource \
you can use to develop applications using animated characters with \
cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "cal3d-devel-0.120-3.11.aarch64.rpm"
RPM_HASH = "aff68a3fef8f479e40e7756359582b113df80ad09cb5face5353d0312aea21509c77f032dabdec6fc946f2181751679b55ae4e6716685f8866796c4c13caf82a"

RPROVIDES:${PN} += "cal3d-devel \
pkgconfig-cal3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcal3d12"

inherit rpm

SUMMARY = "Development files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the development and header files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.7"

RPM_NAME = "callaudiod-devel-0.1.7-1.1.aarch64.rpm"
RPM_HASH = "55b3afa147934193a8becb236bb5a848050ccb412e555ab8c27b362821491e2289ff16ac6e71df0955c54d25c0f6f1fe754d47332a2cd0915f77793f3ccf5614"

RPROVIDES:${PN} += "callaudiod-devel \
callaudiod-devel(aarch-64) \
pkgconfig(libcallaudio-0.1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
callaudiod \
libcallaudio0_1-0 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm

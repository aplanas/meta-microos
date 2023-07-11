SUMMARY = "Development files for libtracecmd"
DESCRIPTION = "Development files of the libtracecmd library"
LICENSE = "LGPL-2.1-only"

PV = "1.3.1"

RPM_NAME = "libtracecmd-devel-1.3.1-2.4.aarch64.rpm"
RPM_HASH = "957a491cf7c160303a34fad395070ef1257327cc1ef87b3e230f629c801a7e018c3cd83b6e5ab692792e85d3db6c2b6ab270b9ea521d9564ed16cf7cd2021197"

RPROVIDES:${PN} += "libtracecmd-devel \
pkgconfig-libtracecmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracecmd1 \
pkgconfig-libtraceevent \
pkgconfig-libtracefs \
pkgconfig-libzstd"

inherit rpm

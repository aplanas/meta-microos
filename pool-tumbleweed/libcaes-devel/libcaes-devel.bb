SUMMARY = "Development files for libcaes, a AES encryption library"
DESCRIPTION = "libcaes is a library for AES encryption. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcaes."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes-devel-20230406-2.1.aarch64.rpm"
RPM_HASH = "47373c63067c6e5f54e78372c2746eafd95db8674d8a6ad325844279ccaa049c64e8327c7e9a0dc3770cdd0e41d82155838d2da5e8fb0dc81e88efa7eb0c9005"

RPROVIDES:${PN} += "libcaes-devel \
pkgconfig-libcaes"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaes1"

inherit rpm

SUMMARY = "Header files for the libcap-ng library"
DESCRIPTION = "The libcap-ng-devel package contains the files needed for developing \
applications that need to use the libcap-ng library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-devel-0.8.3-2.3.aarch64.rpm"
RPM_HASH = "14eb2b6fe4da22ecc6ac1484cc9515cd9cab82add0a2134e05f37d48889e0ca1d2d89b8a740dd9f38adbc90fd00eb08a89c0164eec6dcd020d7f82dd51d09fda"

RPROVIDES:${PN} += "libcap-ng-devel \
pkgconfig-libcap-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernel-headers \
libcap-ng0 \
pkgconfig"

inherit rpm

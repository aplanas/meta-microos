SUMMARY = "Development files for libcerror, a C error library"
DESCRIPTION = "A library for C error functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcerror."
LICENSE = "LGPL-3.0-or-later"

PV = "20220101"

RPM_NAME = "libcerror-devel-20220101-4.3.aarch64.rpm"
RPM_HASH = "26a08a24b20d7e054c65b63290c016bfaaafeb6cf6378258f0b662960a3a563d5542da218cc7be4f549d249ff9af2b3c56e04b21e41bbbd850c0b7ca104571e3"

RPROVIDES:${PN} += "libcerror-devel \
pkgconfig-libcerror"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerror1"

inherit rpm

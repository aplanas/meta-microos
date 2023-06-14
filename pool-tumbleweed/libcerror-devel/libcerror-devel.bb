SUMMARY = "Development files for libcerror, a C error library"
DESCRIPTION = "A library for C error functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcerror."
LICENSE = "LGPL-3.0-or-later"

PV = "20220101"

RPM_NAME = "libcerror-devel-20220101-4.2.aarch64.rpm"
RPM_HASH = "f31e84a4d69cdb2d708f7739f466cb91e615ec6f9d18af2da26685abf1dc3aa0dc4b6853c49d006f6c24b1afbee6f5a1cd17e248b768b5513de85f4769b2404d"

RPROVIDES:${PN} += "libcerror-devel \
pkgconfig-libcerror"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerror1"

inherit rpm

SUMMARY = "Development files for GF(2) arithmetic with libm4ri"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4ri."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4ri-devel-20200125-1.4.aarch64.rpm"
RPM_HASH = "9e1b85aa524aa0ca8b6148dc5dfe1babd0e172cdacf937e360725d82317f7975f0bb473d7f9865c5d4ef42510f76ee2cc84db22bc6679960692b7c0acb7049d1"

RPROVIDES:${PN} += "libm4ri-devel \
pkgconfig-m4ri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libm4ri-0-0-20200125 \
pkgconfig-libpng"

inherit rpm

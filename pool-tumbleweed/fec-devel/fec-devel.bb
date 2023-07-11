SUMMARY = "Development files for the libfec library"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfec."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "fec-devel-3.0.0+git.20160910-5.4.aarch64.rpm"
RPM_HASH = "a1828417316e95f4b94c96748f873baac836f5f47fdd1e26e64a108c24476864ea0394147de0d5fdb54923105e95e27e7393d328f535e193d94ad0a6799bee64"

RPROVIDES:${PN} += "fec-devel \
pkgconfig-libfec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfec3"

inherit rpm

SUMMARY = "Library for reading and writing MATLAB MAT files"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "libmatio11-1.5.23-2.2.aarch64.rpm"
RPM_HASH = "3bdf554948bf94e3963b8ad18ebc544871ed903b59ef955c540f9056712a84e8de1906ebc5669b45b98b3bde8bbc4b6ec4413738c36a43e7e78bf03cdb1d5d21"

RPROVIDES:${PN} += "libmatio.so.11 \
libmatio11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5 \
libhdf5.so.200 \
libz.so.1"

inherit rpm

SUMMARY = "Development files for libcpath, a C path library"
DESCRIPTION = "A library for C path functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcpath."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath-devel-20220108-4.6.aarch64.rpm"
RPM_HASH = "1713c2b16392c3c5d7f7eec5c2196e1efb54b3c2a62d4d4f8be59fbdeede92388faf7fe7ca961ce69ae546a5d951e646257a08ef7bcc4274e66e060676915d8e"

RPROVIDES:${PN} += "libcpath-devel \
pkgconfig-libcpath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpath1"

inherit rpm

SUMMARY = "Development files for libcfile, a C file library"
DESCRIPTION = "A library for C file functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcfile."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile-devel-20220106-2.5.aarch64.rpm"
RPM_HASH = "69ec80d30094190b128e84d8b98fa32ff029ad396f16c52c0741cea73a00cbc694cefff7d7b8a1cb7c2aea0f738c255e36037064c36cffe2e9f66faea78352a9"

RPROVIDES:${PN} += "libcfile-devel \
pkgconfig-libcfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfile1"

inherit rpm

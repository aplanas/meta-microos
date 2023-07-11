SUMMARY = "C++ header files and library symbolic links for crc32c"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for libcrc32c. If you would like to develop programs using libcrc32c, \
you will need to install libcrc32c-devel."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c-devel-1.1.2-1.5.aarch64.rpm"
RPM_HASH = "83291060c06217a984850ce28acdf779c1230cd9033a025ea0a3a9888c331a21ccabb836b84f6d1890e8c12f4f2674c13c933ba0fd0e25fa7ca8afc758503609"

RPROVIDES:${PN} += "cmake-Crc32c \
libcrc32c-devel"

RDEPENDS:${PN} += "libcrc32c1"

inherit rpm

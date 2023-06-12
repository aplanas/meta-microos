SUMMARY = "Development files for libcfile, a C file library"
DESCRIPTION = "A library for C file functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcfile."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile-devel-20220106-2.3.aarch64.rpm"
RPM_HASH = "1af2189ea5f60665346eb2bf1ddd6fa13c2abd0427aa8dac36ff7454578b6f4144d156c1abde6b253296f97bda85ac3f78fdc4be9ec6038e5fadb8ea371c751c"

RPROVIDES:${PN} += "libcfile-devel \
libcfile-devel(aarch-64) \
pkgconfig(libcfile)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfile1"

inherit rpm

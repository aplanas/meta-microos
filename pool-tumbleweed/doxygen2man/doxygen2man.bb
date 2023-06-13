SUMMARY = "tool to generate man pages from Doxygen XML files"
DESCRIPTION = "The doxygen2man package contains the doxygen2man utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6+20220323.758044b"

RPM_NAME = "doxygen2man-2.0.6+20220323.758044b-1.3.aarch64.rpm"
RPM_HASH = "a48dd4a56661517e387dd3ed5e86e014998af19222ccb30fcdcd32cb9ec351a6a01f05c6faa4d5bf5109b34e8b9fd1b859a78151cf96072c7f3ef42b723c1d09"

RPROVIDES:${PN} += "doxygen2man \
doxygen2man(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libqb.so.100()(64bit) \
libqb100 \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm

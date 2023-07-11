SUMMARY = "Development files for STK, a music synthesis library"
DESCRIPTION = "The libstk-devel package contains libraries and header files for \
developing applications that use stk."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-devel-4.6.2-1.4.aarch64.rpm"
RPM_HASH = "dfea4e68e0490e7f0577bbc9d6622c36b60745bb61f4b8b812f757d1b5bca23ef356ff3de9ee55490130bc3de1f087ed6e39c8956e027027609a1f82aee4a7f8"

RPROVIDES:${PN} += "libstk-devel \
stk-devel"

RDEPENDS:${PN} += "libstk4.6.2"

inherit rpm

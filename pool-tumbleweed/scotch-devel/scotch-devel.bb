SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "5491b5e09116d68f4e81ed7eba34199cf0a9277ce217eda50697d4420dd2b50ad9ba35a3809677d6664f30664297722e3a5f4e5e13c4b64c10c97586b6a603f3"

RPROVIDES:${PN} += "scotch-devel"

RDEPENDS:${PN} += "gcc-fortran \
libscotch0"

inherit rpm

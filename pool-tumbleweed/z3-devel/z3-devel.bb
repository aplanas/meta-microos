SUMMARY = "Development files for Z3"
DESCRIPTION = "Development files for the Z3 library."
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "z3-devel-4.12.2-1.1.aarch64.rpm"
RPM_HASH = "8800e64feae6c4fd721b59fd69f9150091131df48d4a4d463cc9b18fd95a55aa79ab66c653d1dff0d328791c4d6c001d6cb5eaee6849c9b6f2eaf9c809f5d56a"

RPROVIDES:${PN} += "cmake-Z3 \
pkgconfig-z3 \
z3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz3-4-12"

inherit rpm

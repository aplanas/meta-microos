SUMMARY = "Development files for libwtmpdb"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read, write or modify the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "wtmpdb-devel-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "71da9e80efb52aa4c1348999275c9edb5bae54f2fbc744f7b780898cae4f91c6257f81d1a0b94e7ca86146b3f1e40cc14d4fa809e2f6f19f41f2cbe6fac4bbf2"

RPROVIDES:${PN} += "pkgconfig-libwtmpdb \
wtmpdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwtmpdb0"

inherit rpm

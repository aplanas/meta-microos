SUMMARY = "Development files for libwtmpdb"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that needs to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.9.1"

RPM_NAME = "wtmpdb-devel-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "a02a7a5669ab86823d035292be15ca4479c1612ecc949c34bc6f1eae56e8b3400d4cc4f8fc34b564bc615426dda3c629865679572202a4981e8e648138c02b7e"

RPROVIDES:${PN} += "pkgconfig-libwtmpdb \
wtmpdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwtmpdb0"

inherit rpm

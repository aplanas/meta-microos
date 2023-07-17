SUMMARY = "Development files for libwtmpdb"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that needs to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "wtmpdb-devel-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "ba704e8178f7b89f049e1ce3894b6b61c8b2976f93d3e3766b09b2180e99720ba081e1bc7d4106dafee85f86cbc3315c0099470d759ca24d34028200b59c4c9d"

RPROVIDES:${PN} += "pkgconfig-libwtmpdb \
wtmpdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwtmpdb0"

inherit rpm

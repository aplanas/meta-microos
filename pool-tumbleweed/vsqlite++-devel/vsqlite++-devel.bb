SUMMARY = "Development files for vsqlite++"
DESCRIPTION = "This package contains development files for vsqlite++."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "vsqlite++-devel-0.3.13-4.10.aarch64.rpm"
RPM_HASH = "23a5150fc342db7c25d25331ec3948228c518f3a93bb3f15437c2a6a3c51431ad196bb5051c82d65b53d0e5e715d8bc87d9cc44fd93c3ed3fe7fa93ea5ec1a14"

RPROVIDES:${PN} += "vsqlite++-devel \
vsqlite++-devel(aarch-64)"
RDEPENDS:${PN} += "libvsqlitepp3"

inherit rpm

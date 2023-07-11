SUMMARY = "The system GNU C++ development files"
DESCRIPTION = "The system GNU C++ development files."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1"

PV = "13"

RPM_NAME = "libstdc++-devel-13-1.5.aarch64.rpm"
RPM_HASH = "3e8e8467fb17c8427fbdfe89e339f8e16a2e5eb7dd5c051c8f5ad6d49c4ebeac7e3e8dec6cc8e09390078504e5c5e71263c395fa7946cb43dc6290a1f2ab878b"

RPROVIDES:${PN} += "libstdc++-devel"

RDEPENDS:${PN} += "libstdc++6-devel-gcc13"

inherit rpm

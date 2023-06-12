SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-cloner-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "5fc2be2b67d5770d09a72618a0fb957e3e4765f6c019fee34a1e69e34df5a7606394cfdf68379227270f13dd02ff5ca30122456e1925bf53592a0a5f79b676fe"

RPROVIDES:${PN} += "containerized-data-importer-cloner containerized-data-importer-cloner(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

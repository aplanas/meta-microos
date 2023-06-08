SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-operator-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "10f2592a37289d1df759140b7cabe69ea77abeac51fab25a63070d071142f705cfde242b85739f061ae809382b1bf7c9568653437d4edf76c343aad18929d7af"

RPROVIDES:${PN} += "containerized-data-importer-operator containerized-data-importer-operator(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

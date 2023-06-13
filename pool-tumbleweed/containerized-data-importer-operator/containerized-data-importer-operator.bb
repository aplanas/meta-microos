SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-operator-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "0d89a66919759eb4620c7b7a3d7c3cd925254f9b562c2b05d78748ae025b702d2a2c2a4766cdc85c2140a04f79c132e5753a6020900708ef163baa62e5a03dc0"

RPROVIDES:${PN} += "containerized-data-importer-operator \
containerized-data-importer-operator(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

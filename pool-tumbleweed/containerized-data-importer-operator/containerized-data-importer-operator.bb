SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-operator-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "c01bf77dfd1c83c76a6545b00f5460b20050185cf6d955b6296f877d2282bfb141e546082d554a541a553ed53e1e5e7646ad7bc16e34438abc8a094e0a3051dc"

RPROVIDES:${PN} += "containerized-data-importer-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

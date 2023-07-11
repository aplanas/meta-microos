SUMMARY = "API documentation for osgi-service-jdbc"
DESCRIPTION = "This package provides API documentation for osgi-service-jdbc."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-javadoc-1.0.0-1.2.noarch.rpm"
RPM_HASH = "e97ff732520e6f26a30db48ef38a74a2b5a5fcb0b14c8e477b44b1c31f120a8a4a00c898dc2bc6c8c4a9cf8663a828b7c9dc2b1fbda1bd3effef0896ae31eb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

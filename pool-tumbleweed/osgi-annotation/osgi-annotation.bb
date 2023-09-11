SUMMARY = "Annotations for use in compiling OSGi bundles"
DESCRIPTION = "Annotations for use in compiling OSGi bundles. This package is not normally \
needed at run-time."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "osgi-annotation-8.1.0-1.1.noarch.rpm"
RPM_HASH = "dacf59cf76d7a1dbdc1a64b107c09d0e00624073f6bf845c655522a942a558bcd13e2536df1f5381f7bde4f2a69a9a138e95e35448ba2dea415c1361ea8ad305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.annotation \
mvn-org.osgi-org.osgi.annotation-pom- \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.annotation-pom- \
osgi-annotation \
osgi-osgi.annotation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

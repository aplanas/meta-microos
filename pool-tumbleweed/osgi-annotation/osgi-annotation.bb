SUMMARY = "Annotations for use in compiling OSGi bundles"
DESCRIPTION = "Annotations for use in compiling OSGi bundles. This package is not normally \
needed at run-time."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-annotation-7.0.0-3.5.noarch.rpm"
RPM_HASH = "bd282e9bd13975b2aafb24dcb72437cfc1ea998b4efbf4ca478f896279029b49b1a598eccf75bf6227916b1375d85da61be94d058883fd0dd6ea7fb50fbe3895"
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

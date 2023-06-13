SUMMARY = "Istack-commons tools"
DESCRIPTION = "This package contains istack-commons tools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-tools-3.0.7-4.4.noarch.rpm"
RPM_HASH = "3c1a686b4e808e6f86ec694e5113008d2543affaf7779053694c480e0c1bf366566f81668f452595f2e0b66ab4956cb35a2a00c9aeda0ac90462e688522339f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-tools \
mvn(com.sun.istack:istack-commons-tools) \
mvn(com.sun.istack:istack-commons-tools:pom:) \
osgi(com.sun.istack.commons-tools)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant)"

inherit rpm

SUMMARY = "Apache Felix Service Component Runtime (SCR)"
DESCRIPTION = "Implementation of the OSGi Declarative Services Specification Version 1.3 (R6)."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-2.1.16-1.18.noarch.rpm"
RPM_HASH = "9c2b7838ae67f4ca1861274f7c3076dff76a77dbc2c8dceaa6d45cb811371dcb0c792d7607f4f197ac46b752a0a77b5aa6a3f189006d37e573382f5e71f44fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr \
mvn(org.apache.felix:org.apache.felix.scr) \
mvn(org.apache.felix:org.apache.felix.scr:pom:) \
osgi(org.apache.felix.scr)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

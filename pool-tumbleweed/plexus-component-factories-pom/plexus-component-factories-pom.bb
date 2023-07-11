SUMMARY = "Plexus Component Factories POM"
DESCRIPTION = "This package provides Plexus Component Factories parent POM used by different \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "1.0~alpha11"

RPM_NAME = "plexus-component-factories-pom-1.0~alpha11-1.23.noarch.rpm"
RPM_HASH = "2f2e55edc8726054c3351bcab1c3193e052c50c813896ed763de2402ad41192ba2e4e5369368c2602676f177cc7678baf9b679430652d308d86158930c0b976b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-factories-pom- \
mvn-plexus-plexus-component-factories-pom- \
plexus-component-factories-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-pom-"

inherit rpm

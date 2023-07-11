SUMMARY = "Plexus Velocity Component"
DESCRIPTION = "This package provides Plexus Velocity component - a wrapper for \
Apache Velocity template engine, which allows easy use of Velocity \
by applications built on top of Plexus container."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "plexus-velocity-1.2-4.7.noarch.rpm"
RPM_HASH = "c1895d20014188d57130ada146ae16a0041e0d2d6dec1fc7f62b245e618208f6b8854c06b2a9fe7d42b1f9a1965d95eaf5452c4dca7114c7b9243152a2342bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.codehaus.plexus-plexus-velocity-pom- \
plexus-velocity"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-velocity-velocity"

inherit rpm

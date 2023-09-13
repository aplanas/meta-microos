SUMMARY = "API for I/O support like logging, download or file scanning"
DESCRIPTION = "API for I/O support like logging, download or file scanning."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-3.0.0-3.1.noarch.rpm"
RPM_HASH = "a229f7868a3509b40b39ce14c720776d21db114e1972ad8f929fc2f001536a28b24fdefeaf01b03627bf9dfd281181d73cf347a563e5d530f512d2e4d8aa85dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-io-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm

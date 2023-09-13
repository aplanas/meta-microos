SUMMARY = "Maven dependency tree artifact"
DESCRIPTION = "Apache Maven dependency tree artifact. Originally part of maven-shared."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-3.0.1-4.1.noarch.rpm"
RPM_HASH = "d6697942e9767ad3c6edb8bc0c388030846e7db59a85ebf3564cbd5e606a3a2d9f7904d8878ad6a57f02b2cb6f0468dec946efa97b726e0312e25064fb9e3aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.eclipse.aether-aether-util"

inherit rpm

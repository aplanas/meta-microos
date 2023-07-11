SUMMARY = "Maven dependency tree artifact"
DESCRIPTION = "Apache Maven dependency tree artifact. Originally part of maven-shared."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-3.0.1-3.13.noarch.rpm"
RPM_HASH = "3c5f1396abd950defb10475c2a04b8b62f8293524876efa8ea2f7b53610d36b5adf19d79f5714c1585dbbc3648df096f796c0263cbb8c0101bf8dbfa4ec9219c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.eclipse.aether-aether-util"

inherit rpm

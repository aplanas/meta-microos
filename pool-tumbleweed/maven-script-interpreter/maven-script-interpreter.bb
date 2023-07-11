SUMMARY = "Maven Script Interpreter"
DESCRIPTION = "This component provides some utilities to interpret/execute some scripts for \
various implementations: Groovy or BeanShell. \
 \
Groovy script is currently disabled."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "maven-script-interpreter-1.3-1.5.noarch.rpm"
RPM_HASH = "63d5d9a87e6938c68fe907799ede1d5705fc76a2a2a0bc4ab6a4e375d8e2faef5695b5091641105471da28a8ca1b5158f220c84e25d87330f4938422debc6c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.maven.shared-maven-script-interpreter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.slf4j-slf4j-api"

inherit rpm

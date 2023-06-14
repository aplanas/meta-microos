SUMMARY = "An API for firing a maven build in a clean environment"
DESCRIPTION = "This API is concerned with firing a Maven build in a new JVM. It accomplishes \
its task by building up a conventional Maven command line from options given in \
the current request, along with those global options specified in the invoker \
itself. Once it has the command line, the invoker will execute it, and capture \
the resulting exit code or any exception thrown to signal a failure to execute. \
Input/output control can be specified using an InputStream and up to two \
InvocationOutputHandlers. \
 \
This is a replacement package for maven-shared-invoker"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-invoker-3.1.0-2.3.noarch.rpm"
RPM_HASH = "d5ad747e95eee91973a0bd083fc555d752c558e50aab1c8e09436f436d4d1df9856571eb882bd86cc614ad528e02340ec7ac5e322a7a4321a592c9150a4cbf40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-invoker-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject"

inherit rpm

SUMMARY = "Commons Compiler JDK"
DESCRIPTION = "The 'JDK' implementation of the 'commons-compiler' API that uses the \
JDK's Java compiler (JAVAC) in 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "commons-compiler-jdk-3.1.6-1.11.noarch.rpm"
RPM_HASH = "c66ac4b6eab0d235a9133844e7be9de64dec73e16afeace56e83189f144b47641069d533b36d00d23b7c8fdc2bc43ef4a3231a703f8a7e17d6725c30e29f938a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-compiler-jdk \
mvn-org.codehaus.janino-commons-compiler-jdk \
mvn-org.codehaus.janino-commons-compiler-jdk-pom- \
osgi-org.codehaus.janino.commons-compiler-jdk"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.janino-commons-compiler \
osgi-org.codehaus.janino.commons-compiler"

inherit rpm

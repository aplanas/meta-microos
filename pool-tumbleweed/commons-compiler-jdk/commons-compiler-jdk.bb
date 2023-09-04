SUMMARY = "Commons Compiler JDK"
DESCRIPTION = "The 'JDK' implementation of the 'commons-compiler' API that uses the \
JDK's Java compiler (JAVAC) in 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "commons-compiler-jdk-3.1.10-1.1.noarch.rpm"
RPM_HASH = "f1012ab8957e30def079bf77e92cc9356790210d41f4bc1d47dbf5bbc335a716935ee7d36ff21a0380e07f7031ee433e8222a0297d150ea5a81e5456ba444300"
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

SUMMARY = "Commons Compiler JDK"
DESCRIPTION = "The 'JDK' implementation of the 'commons-compiler' API that uses the \
JDK's Java compiler (JAVAC) in 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "commons-compiler-jdk-3.1.6-1.10.noarch.rpm"
RPM_HASH = "46baf7e9ac700e083ebf79ca05ba678d5088c8eafff77826a2c899cf93e7fd6a21c30b231e19e5202a626657aa6b330b703b669951e7c8fbd1cbb79a311ab943"
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

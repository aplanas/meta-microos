SUMMARY = "Commons Compiler JDK"
DESCRIPTION = "The 'JDK' implementation of the 'commons-compiler' API that uses the \
JDK's Java compiler (JAVAC) in 'tools.jar'."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "commons-compiler-jdk-3.1.10-2.1.noarch.rpm"
RPM_HASH = "07f53a50de777575cf8bb6f376d141f082a24916e33a3863a8835eb1569b5f76b5bb04e1953434ae79421d3023f8226daed3a46d6cf1d28610e2c4818b81f441"
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

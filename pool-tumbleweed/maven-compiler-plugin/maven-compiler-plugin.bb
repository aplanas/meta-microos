SUMMARY = "Maven Compiler Plugin"
DESCRIPTION = "The Compiler Plugin is used to compile the sources of your project."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-compiler-plugin-3.10.1-1.12.noarch.rpm"
RPM_HASH = "81759024eccad76eaeb417a835ec06e2170cf54bd6aa9826733ba1539acdf73957a49d57a5cabdb3b379db8881d855fc903135a9d5f885f8e587e48e2972b327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-compiler-javac \
mvn-org.codehaus.plexus-plexus-compiler-manager \
mvn-org.codehaus.plexus-plexus-java"

inherit rpm

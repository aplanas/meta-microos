SUMMARY = "Compiler call initiators for Plexus"
DESCRIPTION = "Plexus Compiler adds support for using various compilers from a \
unified api. Support for javac is available in main package. For \
additional compilers see plexus-compiler-extras package."
LICENSE = "Apache-2.0 & MIT"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-2.11.1-3.5.noarch.rpm"
RPM_HASH = "c36cd2ca64768a69fc2bd4cfe5f27f05eef4f24620d1260a98535094ab1fa82ba0165af192a1dc137c803adaa5a250cd36f060dce6233ac7d7c21e6a42b07a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-compiler-api-pom- \
mvn-org.codehaus.plexus-plexus-compiler-j2objc \
mvn-org.codehaus.plexus-plexus-compiler-j2objc-pom- \
mvn-org.codehaus.plexus-plexus-compiler-javac \
mvn-org.codehaus.plexus-plexus-compiler-javac-pom- \
mvn-org.codehaus.plexus-plexus-compiler-manager \
mvn-org.codehaus.plexus-plexus-compiler-manager-pom- \
plexus-compiler"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm

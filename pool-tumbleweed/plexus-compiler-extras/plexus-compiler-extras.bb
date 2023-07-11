SUMMARY = "Extra compiler support for plexus-compiler"
DESCRIPTION = "Additional support for csharp, eclipse and jikes compilers"
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-extras-2.11.1-3.5.noarch.rpm"
RPM_HASH = "0c362c1d2091a8a3aae9a395aadb0872fae92c41b4456c506a93abf9e731d574191ebaff2cac5a72462669d257385b49d92a1d23f6933b897ff294ff029403d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-compiler-csharp \
mvn-org.codehaus.plexus-plexus-compiler-csharp-pom- \
mvn-org.codehaus.plexus-plexus-compiler-eclipse \
mvn-org.codehaus.plexus-plexus-compiler-eclipse-pom- \
plexus-compiler-extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.jdt-ecj"

inherit rpm

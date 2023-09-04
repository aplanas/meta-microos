SUMMARY = "Jackson module that uses LambdaMetafactory based code generation to replace reflection calls."
DESCRIPTION = "The LambdaMetafactory introduces a standard Java API for dynamically instantiating function objects. \
The current OpenJDK implementation generates anonymous classes in a somewhat similar fashion to the \
classic Afterburner. While the metafactory cannot generate comparably specialized implementations, \
we can write needed adapters as simple Java code and use the metafactory to create distinct call \
sites for every needed access path. This should allow each accessor to have a monomorphic call \
profile and easily inline for maximum performance."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-blackbird-2.15.2-1.1.noarch.rpm"
RPM_HASH = "a6af4659a9304b48bbfcc05427f10d4cf990941e71189e502d2802ade324658753d98e9364b10d39dc3d4e73deb742c3fff28bd984df23931e937af8b7694e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-blackbird \
mvn-com.fasterxml.jackson.module-jackson-module-blackbird \
mvn-com.fasterxml.jackson.module-jackson-module-blackbird-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-blackbird"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm

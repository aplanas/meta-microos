SUMMARY = "Jackson module that uses LambdaMetafactory based code generation to replace reflection calls."
DESCRIPTION = "The LambdaMetafactory introduces a standard Java API for dynamically instantiating function objects. \
The current OpenJDK implementation generates anonymous classes in a somewhat similar fashion to the \
classic Afterburner. While the metafactory cannot generate comparably specialized implementations, \
we can write needed adapters as simple Java code and use the metafactory to create distinct call \
sites for every needed access path. This should allow each accessor to have a monomorphic call \
profile and easily inline for maximum performance."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-blackbird-2.13.3-1.8.noarch.rpm"
RPM_HASH = "9b7cdc5ef7c9c7ed41952a69dfa2dc84b9796fdcf3bae3e542561aa995f66c471d2965656af485d3b72dfbd36fa7d0ed4285367b5fd6c65f25a4fe0ebcf95724"
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

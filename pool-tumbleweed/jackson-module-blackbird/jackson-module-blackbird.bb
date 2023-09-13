SUMMARY = "Jackson module that uses LambdaMetafactory based code generation to replace reflection calls."
DESCRIPTION = "The LambdaMetafactory introduces a standard Java API for dynamically instantiating function objects. \
The current OpenJDK implementation generates anonymous classes in a somewhat similar fashion to the \
classic Afterburner. While the metafactory cannot generate comparably specialized implementations, \
we can write needed adapters as simple Java code and use the metafactory to create distinct call \
sites for every needed access path. This should allow each accessor to have a monomorphic call \
profile and easily inline for maximum performance."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-blackbird-2.15.2-2.1.noarch.rpm"
RPM_HASH = "0f03ad33a61b4679577b3ab65b1f25609cea78f876e3c2de5e5096019b14a4eb7060b93c15850212ca45bd1bd58d642d4ec6f7fae5b549fa14cd26382daebea3"
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

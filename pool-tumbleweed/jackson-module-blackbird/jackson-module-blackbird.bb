SUMMARY = "Jackson module that uses LambdaMetafactory based code generation to replace reflection calls."
DESCRIPTION = "The LambdaMetafactory introduces a standard Java API for dynamically instantiating function objects. \
The current OpenJDK implementation generates anonymous classes in a somewhat similar fashion to the \
classic Afterburner. While the metafactory cannot generate comparably specialized implementations, \
we can write needed adapters as simple Java code and use the metafactory to create distinct call \
sites for every needed access path. This should allow each accessor to have a monomorphic call \
profile and easily inline for maximum performance."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-blackbird-2.13.3-1.7.noarch.rpm"
RPM_HASH = "9d71aa5e21fa19c5caed6da745c6fc125365da09fb968ea8bfa077ce8e67e63278b924e586cd17626867abb5a9b4d175cad0023fb64d2cd6eea9839bc7418f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-blackbird \
mvn(com.fasterxml.jackson.module:jackson-module-blackbird) \
mvn(com.fasterxml.jackson.module:jackson-module-blackbird:pom:) \
osgi(com.fasterxml.jackson.module.jackson-module-blackbird)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind)"

inherit rpm

SUMMARY = "An implementation of the GoF Chain of Responsibility pattern"
DESCRIPTION = "A popular technique for organizing the execution of complex \
processing flows is the 'Chain of Responsibility' pattern, as \
described (among many other places) in the classic 'Gang of Four' \
design patterns book. Although the fundamental API contracts \
required to implement this design pattern are extremely simple, \
it is useful to have a base API that facilitates using the pattern, \
and (more importantly) encouraging composition of command \
implementations from multiple diverse sources. \
Towards that end, the Chain API models a computation as a series \
of 'commands' that can be combined into a 'chain'. The API for a \
command consists of a single method (execute()), which is passed \
a 'context' parameter containing the dynamic state of the \
computation, and whose return value is a boolean that determines \
whether or not processing for the current chain has been completed \
(true), or whether processing should be delegated to the next \
command in the chain (false)."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "apache-commons-chain-1.2-2.6.noarch.rpm"
RPM_HASH = "8581901b1a61540d48c5e22c9b9b97598406a9cc13e5857974b182c03e9a3b2a3c90f70783250c01b0806a296575071cbe483ee68dce606cb50f54b77fd568f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-chain \
mvn(commons-chain:commons-chain) \
mvn(commons-chain:commons-chain:pom:) \
mvn(org.apache.commons:commons-chain) \
mvn(org.apache.commons:commons-chain:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-beanutils:commons-beanutils) \
mvn(commons-digester:commons-digester) \
mvn(commons-logging:commons-logging)"

inherit rpm

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

RPM_NAME = "apache-commons-chain-1.2-2.7.noarch.rpm"
RPM_HASH = "d5783f1bfa9c7ed84ddcc7921b7ca476b9f6950d52d71d7831c2727d1bc8c0312b3e5197516c6e71c2decaa0ee04687e21b2e7341647dfe1d8bde13eb7804257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-chain \
mvn-commons-chain-commons-chain \
mvn-commons-chain-commons-chain-pom- \
mvn-org.apache.commons-commons-chain \
mvn-org.apache.commons-commons-chain-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-digester-commons-digester \
mvn-commons-logging-commons-logging"

inherit rpm

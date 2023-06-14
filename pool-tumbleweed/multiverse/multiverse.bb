SUMMARY = "A software transactional memory implementation for the JVM"
DESCRIPTION = "A software transactional memory implementation for the JVM. Access (read and \
writes) to shared memory is done through transactional references, that can be \
compared to the AtomicReferences of Java. Access to these references will be \
done under A (atomicity), C (consistency), I (isolation) semantics."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-0.7.0-3.10.noarch.rpm"
RPM_HASH = "4d58249cccddf5c6a67ab9eb5b1544a22b0efc7ddea9d8c7389e99abee3e518bb0934015ce08785aae394df221e11c123746277014242939d03475b40a4a3f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse \
mvn-org.multiverse-multiverse-core \
mvn-org.multiverse-multiverse-core-pom- \
mvn-org.multiverse-multiverse-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

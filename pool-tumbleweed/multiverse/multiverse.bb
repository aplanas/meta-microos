SUMMARY = "A software transactional memory implementation for the JVM"
DESCRIPTION = "A software transactional memory implementation for the JVM. Access (read and \
writes) to shared memory is done through transactional references, that can be \
compared to the AtomicReferences of Java. Access to these references will be \
done under A (atomicity), C (consistency), I (isolation) semantics."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-0.7.0-3.11.noarch.rpm"
RPM_HASH = "dc3806b7a210028336a363006b04961e3addca6cdcde4ced151aa0142ab49a3d284e999cbaaf1abe77335c21c15ae71f34f84c96d7e5cae0b2a5f01ce74ece53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse \
mvn-org.multiverse-multiverse-core \
mvn-org.multiverse-multiverse-core-pom- \
mvn-org.multiverse-multiverse-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "JCTools Experimental implementations"
DESCRIPTION = "Experimental implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-experimental-3.3.0-2.11.noarch.rpm"
RPM_HASH = "b80f4b88c9a8fa950d78f3e6e3b103a4e059f15261d99c961afbbdd955e0c9577ea84089242d9d2ba33c0835eb430619166dc9af64771f735c06fbb50b4b25ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-experimental \
mvn-org.jctools-jctools-experimental \
mvn-org.jctools-jctools-experimental-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-channels \
mvn-org.jctools-jctools-core \
mvn-org.ow2.asm-asm-all"

inherit rpm

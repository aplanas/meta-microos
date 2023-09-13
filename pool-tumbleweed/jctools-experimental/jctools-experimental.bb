SUMMARY = "JCTools Experimental implementations"
DESCRIPTION = "Experimental implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-experimental-3.3.0-3.1.noarch.rpm"
RPM_HASH = "41a38726d9c5355516015bece12d91b03245b73c87c74afd3fe23107c35d93712f0f88df9c67eb80e8c2cbfc350dd226e144d7ac347538f5c56197aec7634f22"
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

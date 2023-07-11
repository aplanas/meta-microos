SUMMARY = "Istack-commons soimp"
DESCRIPTION = "This package contains istack-commons soimp."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-soimp-3.0.7-4.5.noarch.rpm"
RPM_HASH = "55e878fc15f9931257de7d8b7b0913afafc1f0fe9e790859e60edadedf20d4194e431c105a564765ef9fa5abde9923c83292a55a1cfddaebe2a532aaedc10fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-soimp \
mvn-com.sun.istack-istack-commons-soimp \
mvn-com.sun.istack-istack-commons-soimp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-args4j-args4j \
mvn-org.apache.ant-ant"

inherit rpm

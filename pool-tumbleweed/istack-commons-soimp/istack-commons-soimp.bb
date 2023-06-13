SUMMARY = "Istack-commons soimp"
DESCRIPTION = "This package contains istack-commons soimp."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-soimp-3.0.7-4.4.noarch.rpm"
RPM_HASH = "b1d58ebe61e339b0dc1025e549056527c2c4d2e3bbd86eb386a931ce7e2976acdbe5cc5622d86f2a308f45f3734225b71771a3cd6cfb7fd6cc5f6e24d01513d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-soimp \
mvn(com.sun.istack:istack-commons-soimp) \
mvn(com.sun.istack:istack-commons-soimp:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(args4j:args4j) \
mvn(org.apache.ant:ant)"

inherit rpm

SUMMARY = "Istack-commons runtime"
DESCRIPTION = "This package contains istack-commons runtime."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-runtime-3.0.7-4.4.noarch.rpm"
RPM_HASH = "e8d04a349d1f68774c9429dd195e6769e153ca77588bd4785c785c5426aafc398a39bd52fa8c97755973f1d45f3db806d1abddabb2577d03272df444f55f23f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-runtime \
mvn(com.sun.istack:istack-commons-runtime) \
mvn(com.sun.istack:istack-commons-runtime:pom:) \
osgi(com.sun.istack.commons-runtime)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.activation:javax.activation-api)"

inherit rpm

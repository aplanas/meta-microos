SUMMARY = "JCTools Channel implementations"
DESCRIPTION = "Channel implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-channels-3.3.0-3.1.noarch.rpm"
RPM_HASH = "21533459525769ec3655e28645258e4eab18ef07d5ccabfc7fb1e25b7f2bfb9d90d1593e769e16434d0239d8bf87411dae689b8c8e320f619ade1b87d83ca15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-channels \
mvn-org.jctools-jctools-channels \
mvn-org.jctools-jctools-channels-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-core \
mvn-org.ow2.asm-asm-all"

inherit rpm

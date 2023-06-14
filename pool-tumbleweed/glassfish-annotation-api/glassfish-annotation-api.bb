SUMMARY = "Common Annotations API Specification (JSR 250)"
DESCRIPTION = "Common Annotations APIs for the Java Platform (JSR 250)."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-1.3.2-3.6.noarch.rpm"
RPM_HASH = "a311a9bba1f7eefc895dc96e9a32fd9eb9323ccbc98f0350b08caad6309d34bde077687e3ff258da00037eec7e75414bd6d6ffc8ecd4a80f66371c4c703c742c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.annotation-javax.annotation-api-pom- \
osgi-javax.annotation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

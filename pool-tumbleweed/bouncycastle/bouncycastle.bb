SUMMARY = "Bouncy Castle Cryptography APIs for Java"
DESCRIPTION = "The Bouncy Castle Crypto package is a Java implementation of cryptographic \
algorithms. This jar contains JCE provider and lightweight API for the \
Bouncy Castle Cryptography APIs for JDK 1.5 to JDK 1.8."
LICENSE = "Apache-2.0 & MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-1.73-1.1.noarch.rpm"
RPM_HASH = "c688c763a3a122671e24383861c87c3850f50cb386881298d463f40d69c1cb24995ca262bd80be1004f46f789fc79d061bfb082bbf86343646e6899daf1b7b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcprov \
bouncycastle \
config-bouncycastle \
mvn-org.bouncycastle-bcprov-jdk15 \
mvn-org.bouncycastle-bcprov-jdk15-pom- \
mvn-org.bouncycastle-bcprov-jdk15on \
mvn-org.bouncycastle-bcprov-jdk15on-pom- \
mvn-org.bouncycastle-bcprov-jdk15to18 \
mvn-org.bouncycastle-bcprov-jdk15to18-pom- \
mvn-org.bouncycastle-bcprov-jdk16 \
mvn-org.bouncycastle-bcprov-jdk16-pom- \
mvn-org.bouncycastle-bcprov-jdk18 \
mvn-org.bouncycastle-bcprov-jdk18-pom- \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on-pom- \
osgi-bcprov"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

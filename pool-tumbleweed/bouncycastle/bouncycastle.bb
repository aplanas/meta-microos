SUMMARY = "Bouncy Castle Cryptography APIs for Java"
DESCRIPTION = "The Bouncy Castle Crypto package is a Java implementation of cryptographic \
algorithms. This jar contains JCE provider and lightweight API for the \
Bouncy Castle Cryptography APIs for JDK 1.5 to JDK 1.8."
LICENSE = "Apache-2.0 & MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-1.74-1.1.noarch.rpm"
RPM_HASH = "90ca62bf4e88816a407a040acaf693a484fc42ef0f9020780dda8b67fabc82cea3ca1fac319977c81f2fce5054d12d063d0da633e6e2b9689b5c8c7b4ca02e10"
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

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

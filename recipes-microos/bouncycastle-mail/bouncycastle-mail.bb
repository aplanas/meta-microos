SUMMARY = "Bouncy Castle S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. The APIs can \
be used in conjunction with a JCE/JCA provider such as the one provided with \
the Bouncy Castle Cryptography APIs. The JavaMail API and the Java activation \
framework will also be needed."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-mail-1.73-1.1.noarch.rpm"
RPM_HASH = "36299821c2487e8266e0d43335dd57d42fb75e04aafe8935f5c06808af6a2d42e53a3fa27a7a1366a72ec17c6192ced621a7078360ef06f98277ec70a3a5a8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-mail mvn(org.bouncycastle:bcmail-jdk15) mvn(org.bouncycastle:bcmail-jdk15:pom:) mvn(org.bouncycastle:bcmail-jdk15on) mvn(org.bouncycastle:bcmail-jdk15on:pom:) mvn(org.bouncycastle:bcmail-jdk15to18) mvn(org.bouncycastle:bcmail-jdk15to18:pom:) mvn(org.bouncycastle:bcmail-jdk16) mvn(org.bouncycastle:bcmail-jdk16:pom:) mvn(org.bouncycastle:bcmail-jdk18) mvn(org.bouncycastle:bcmail-jdk18:pom:) mvn(org.bouncycastle:bcmail-jdk18on) mvn(org.bouncycastle:bcmail-jdk18on:pom:) osgi(bcmail)"
RDEPENDS:${PN} += "bouncycastle bouncycastle-pkix bouncycastle-util java-headless javapackages-filesystem mvn(org.bouncycastle:bcpkix-jdk18on) mvn(org.bouncycastle:bcprov-jdk18on) mvn(org.bouncycastle:bcutil-jdk18on)"

inherit rpm

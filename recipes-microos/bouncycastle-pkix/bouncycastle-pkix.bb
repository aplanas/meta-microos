SUMMARY = "Bouncy Castle PKIX, CMS, EAC, TSP, PKCS, OCSP, CMP, and CRMF APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for CMS, PKCS, EAC, TSP, CMP, CRMF, OCSP, and \
certificate generation. This jar contains APIs for JDK 1.5 to JDK 1.8. The \
APIs can be used in conjunction with a JCE/JCA provider such as the one \
provided with the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-pkix-1.73-1.1.noarch.rpm"
RPM_HASH = "527e2db9dbf9597223038a4f45955ea9cd9088b17903a503433e444a89213719003e1332b4ce389dbf97812de7bf4b17bb592de3d1b49549fc271be80d465120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-pkix mvn(org.bouncycastle:bcpkix-jdk15) mvn(org.bouncycastle:bcpkix-jdk15:pom:) mvn(org.bouncycastle:bcpkix-jdk15on) mvn(org.bouncycastle:bcpkix-jdk15on:pom:) mvn(org.bouncycastle:bcpkix-jdk15to18) mvn(org.bouncycastle:bcpkix-jdk15to18:pom:) mvn(org.bouncycastle:bcpkix-jdk16) mvn(org.bouncycastle:bcpkix-jdk16:pom:) mvn(org.bouncycastle:bcpkix-jdk18) mvn(org.bouncycastle:bcpkix-jdk18:pom:) mvn(org.bouncycastle:bcpkix-jdk18on) mvn(org.bouncycastle:bcpkix-jdk18on:pom:) osgi(bcpkix)"
RDEPENDS:${PN} += "bouncycastle bouncycastle-util java-headless javapackages-filesystem mvn(org.bouncycastle:bcprov-jdk18on) mvn(org.bouncycastle:bcutil-jdk18on)"

inherit rpm

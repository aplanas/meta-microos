SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Activation Framework"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_0_2-api-1.2-36.12.noarch.rpm"
RPM_HASH = "171d2aa552423d1eb956a68861fc53cd82f29b0cf690a6c6350ffa197791b2fbadf20ea74d280417fab27bb281fd0e28fb1bf6554932430affa48ef26c808c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "activation-1-0-2-api \
activation-api \
geronimo-jaf-1-0-2-api \
jaf \
jaf-1-0-2-api \
jaf-api \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm

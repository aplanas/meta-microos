SUMMARY = "JAXB Runtime"
DESCRIPTION = "JAXB (JSR 222) Reference Implementation"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-2.3.1-4.5.noarch.rpm"
RPM_HASH = "ae2135dd102f0529833a2574788acaa93c2eed58a471060e7bee23909d1b8fd0dc15c47437af8bf5181a3d64af4eba2deb3cdc6d5e9602fe351adfebf018e8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-runtime \
mvn-com.sun.xml.bind-jaxb-impl \
mvn-com.sun.xml.bind-jaxb-impl-pom- \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-jaxb-runtime-pom- \
osgi-com.sun.xml.bind.jaxb-impl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.xml.fastinfoset-FastInfoset \
mvn-javax.activation-javax.activation-api \
mvn-javax.xml.bind-jaxb-api \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.jvnet.staxex-stax-ex"

inherit rpm

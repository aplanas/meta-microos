SUMMARY = "TXW2 Compiler"
DESCRIPTION = "JAXB schema generator. The tool to generate XML schema based on java \
classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txwc2-2.3.1-4.5.noarch.rpm"
RPM_HASH = "e5771d95208ac1f421057386a15d076e0d2abefb1e979d1d746b9971c8a154f9de1c02b686d12837bdb763fa359a92266ff5145cbe73038af783f96a0ea9eafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txwc2 \
mvn-org.glassfish.jaxb-txwc2 \
mvn-org.glassfish.jaxb-txwc2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-args4j-args4j \
mvn-com.sun.xml.bind.external-rngom \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.glassfish.jaxb-xsom"

inherit rpm

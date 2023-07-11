SUMMARY = "JAXB XJC"
DESCRIPTION = "JAXB Binding Compiler. Contains source code needed for binding \
customization files into java sources. In other words: the tool to \
generate java classes for the given xml representation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xjc-2.3.1-4.5.noarch.rpm"
RPM_HASH = "123552d7f9c8a5fa20bd5987380b49a51d5ff71a2889cd5567827afab141547bb7506df4d1e2b21cb445072442a89bed45a615175fcdeff1bee2c4061d1a2018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xjc \
mvn-com.sun.xml.bind-jaxb-xjc \
mvn-com.sun.xml.bind-jaxb-xjc-pom- \
mvn-org.glassfish.jaxb-jaxb-xjc \
mvn-org.glassfish.jaxb-jaxb-xjc-jdk9 \
mvn-org.glassfish.jaxb-jaxb-xjc-jdk9-pom- \
mvn-org.glassfish.jaxb-jaxb-xjc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.istack-istack-commons-tools \
mvn-com.sun.xml.bind.external-relaxng-datatype \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.dtd-parser-dtd-parser \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-xsom"

inherit rpm

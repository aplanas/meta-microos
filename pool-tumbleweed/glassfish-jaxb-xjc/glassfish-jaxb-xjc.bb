SUMMARY = "JAXB XJC"
DESCRIPTION = "JAXB Binding Compiler. Contains source code needed for binding \
customization files into java sources. In other words: the tool to \
generate java classes for the given xml representation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xjc-2.3.1-4.4.noarch.rpm"
RPM_HASH = "850a9eb546ecbdcd8e55c90707a4bf11dab6691f244cceb3da8b07d1826a668b41676fa90fcff628948e5add9165f8db2b8091d38440260793999ed4a3b4a79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xjc \
mvn(com.sun.xml.bind:jaxb-xjc) \
mvn(com.sun.xml.bind:jaxb-xjc:pom:) \
mvn(org.glassfish.jaxb:jaxb-xjc) \
mvn(org.glassfish.jaxb:jaxb-xjc-jdk9) \
mvn(org.glassfish.jaxb:jaxb-xjc-jdk9:pom:) \
mvn(org.glassfish.jaxb:jaxb-xjc:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.sun.istack:istack-commons-runtime) \
mvn(com.sun.istack:istack-commons-tools) \
mvn(com.sun.xml.bind.external:relaxng-datatype) \
mvn(com.sun.xml.bind.external:rngom) \
mvn(com.sun.xml.dtd-parser:dtd-parser) \
mvn(org.glassfish.jaxb:codemodel) \
mvn(org.glassfish.jaxb:jaxb-runtime) \
mvn(org.glassfish.jaxb:xsom)"

inherit rpm

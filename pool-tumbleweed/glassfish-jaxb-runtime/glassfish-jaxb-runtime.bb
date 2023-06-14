SUMMARY = "JAXB Runtime"
DESCRIPTION = "JAXB (JSR 222) Reference Implementation"
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-2.3.1-4.4.noarch.rpm"
RPM_HASH = "14e458ad0e01faeb8261f392200fc3c14ffe5f46a230a6bd10cd0c41cef9e9b72dd44e2f3b548f93e719d29d83060d0f8f130db0f1cae092e1f0348153a9ad77"
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

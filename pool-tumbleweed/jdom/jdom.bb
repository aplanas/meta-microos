SUMMARY = "Java alternative to DOM and SAX"
DESCRIPTION = "JDOM is, quite simply, a Java representation of an XML document. JDOM \
provides a way to represent that document for easy and efficient \
reading, manipulation, and writing. It has a straightforward API, is a \
lightweight and fast, and is optimized for the Java programmer. It's an \
alternative to DOM and SAX, although it integrates well with both DOM \
and SAX."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-1.1.3-40.1.noarch.rpm"
RPM_HASH = "46f19be3e09471893c1b6f78eea793bf993772878cda904c916907f9cd960690f7f94afb3aca8f914736af44ba14e862b13eae99d6c1f49af055f0f4820206d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom \
mvn-jdom-jdom \
mvn-jdom-jdom-pom- \
mvn-org.jdom-jdom \
mvn-org.jdom-jdom-legacy \
mvn-org.jdom-jdom-legacy-pom- \
mvn-org.jdom-jdom-pom- \
osgi-org.jdom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

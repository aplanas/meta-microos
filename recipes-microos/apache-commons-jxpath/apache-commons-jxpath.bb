SUMMARY = "Simple XPath interpreter"
DESCRIPTION = "Defines a simple interpreter of an expression language called XPath. \
JXPath applies XPath expressions to graphs of objects of all kinds: \
JavaBeans, Maps, Servlet contexts, DOM etc, including mixtures thereof."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-1.3-9.15.noarch.rpm"
RPM_HASH = "bfb3506602e77f03dee5a6e20cb00d22e01d783976860fbcb85a5916c94a29c374f1ba3dc932b0979267703e061bba5cbcb40db3fc94578014941caf44b1ab6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath \
commons-jxpath \
jakarta-commons-jxpath \
mvn(commons-jxpath:commons-jxpath) \
mvn(commons-jxpath:commons-jxpath:pom:) \
mvn(org.apache.commons:commons-jxpath) \
mvn(org.apache.commons:commons-jxpath:pom:) \
osgi(org.apache.commons.jxpath)"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
jdom"

inherit rpm

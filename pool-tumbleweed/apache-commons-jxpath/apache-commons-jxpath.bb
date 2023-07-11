SUMMARY = "Simple XPath interpreter"
DESCRIPTION = "Defines a simple interpreter of an expression language called XPath. \
JXPath applies XPath expressions to graphs of objects of all kinds: \
JavaBeans, Maps, Servlet contexts, DOM etc, including mixtures thereof."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-1.3-9.16.noarch.rpm"
RPM_HASH = "8295b43d7ee239dbe99c791c187550eed7fbe2612fcc527efb625288ddf9a5b0ef6c2b5a542e9c9ecd9fe82d175a87e03df261a1dfcd8db8a16ec7e0ae535652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath \
commons-jxpath \
jakarta-commons-jxpath \
mvn-commons-jxpath-commons-jxpath \
mvn-commons-jxpath-commons-jxpath-pom- \
mvn-org.apache.commons-commons-jxpath \
mvn-org.apache.commons-commons-jxpath-pom- \
osgi-org.apache.commons.jxpath"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
jdom"

inherit rpm

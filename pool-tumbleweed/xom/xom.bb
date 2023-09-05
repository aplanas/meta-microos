SUMMARY = "XML Object Model"
DESCRIPTION = "XOM is a new XML object model. It is an open source (LGPL), \
tree-based API for processing XML with Java that strives \
for correctness, simplicity, and performance, in that order. \
XOM is designed to be easy to learn and easy to use. It \
works very straight-forwardly, and has a very shallow \
learning curve. Assuming you're already familiar with XML, \
you should be able to get up and running with XOM very quickly."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-1.3.9-1.1.noarch.rpm"
RPM_HASH = "7023910c98d67eddd5df00cf164d3e79d603b2be3cc8425cff751e7b6e8dc756f3c37a66a5a27945d37c972a6f75106441f1ad4d0e2124e14ae5cf9978902016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.io7m.xom-xom \
mvn-com.io7m.xom-xom-pom- \
mvn-xom-xom \
mvn-xom-xom-pom- \
osgi-nu.xom \
xom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jaxen-jaxen \
mvn-xerces-xercesImpl"

inherit rpm

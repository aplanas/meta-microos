SUMMARY = "Test Java code using mock objects"
DESCRIPTION = "jMock is a library for testing Java code using mock objects. Mock \
   objects help you design and test the interactions between the \
   objects in your programs. The jMock package: * makes it quick and \
   easy to define mock objects, so you don't break the rhythm of \
   programming. \
 \
* lets you define flexible constraints over object interactions, \
   reducing the brittleness of your tests. \
 \
* is easy to extend."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jmock-javadoc-1.2.0-30.6.noarch.rpm"
RPM_HASH = "269afcdbd9bd548da484609f8f9d8eda598d7568876aff69c759de769608aff92d6c2e93874e28c2dc003b7c778f64ffb1677c7dd160632965cbcf6a8770ebde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

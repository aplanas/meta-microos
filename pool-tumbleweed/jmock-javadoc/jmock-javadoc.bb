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

RPM_NAME = "jmock-javadoc-1.2.0-30.7.noarch.rpm"
RPM_HASH = "8c964bb3804ab7de369966067ca5dea09a64fb03fc033179675630f027ac6619e1c13c4d14f7a0fc5b523b92ddf531213eda8e73de3f359fa1b85d521a419dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

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

RPM_NAME = "jmock-demo-1.2.0-30.6.noarch.rpm"
RPM_HASH = "c734f6051291a6148b09623faa0dbbcdc1fc36920430c8bd0091610321d8b44bfd30367f39b4ffd51e83580d64d6fe772089d21f813b90a9b542fcdb7d35314c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-demo"

RDEPENDS:${PN} += ""

inherit rpm

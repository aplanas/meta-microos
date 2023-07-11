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

RPM_NAME = "jmock-demo-1.2.0-30.7.noarch.rpm"
RPM_HASH = "06b6983f8a6f07b10228747797a1584923d0845fa8ff8f9529cfd41314d61192bcc8f95509efc27aa94d263f4cd1fe5e3b8015eff0981458b64836bb0dc3a784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-demo"

RDEPENDS:${PN} += ""

inherit rpm

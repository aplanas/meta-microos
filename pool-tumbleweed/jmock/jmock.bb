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

RPM_NAME = "jmock-1.2.0-30.7.noarch.rpm"
RPM_HASH = "db3124d9f743ee690b7ee99625faf7f95b625143a29589df5fc3df4ebb913fd1c89865c8e2c4fe4b2264126696db9b3940ef00db552ce7be6fa6d9a5e3bae38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock \
mvn-jmock-jmock \
mvn-jmock-jmock-pom-"

RDEPENDS:${PN} += "cglib \
java-headless \
javapackages-filesystem \
mvn-junit-junit \
objectweb-asm"

inherit rpm

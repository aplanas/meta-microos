SUMMARY = "Commons Collections Package"
DESCRIPTION = "The introduction of the Collections API by Sun in JDK 1.2 \
has been a boon to quick and effective Java programming. \
Ready access to powerful data structures has accelerated \
development by reducing the need for custom container \
classes around each core object.  Most Java2 APIs are \
significantly easier to use because of the Collections API. \
However, there are certain holes left unfilled by Sun's \
implementations, and the Jakarta-Commons Collections \
Component strives to fulfill them. Among the features of \
this package are: - special-purpose implementations of \
Lists and Maps for fast access \
 \
- adapter classes from Java1-style containers (arrays, \
  enumerations) to Java2-style collections \
 \
- methods to test or create typical set theory properties \
  of collections such as union, intersection, and closure"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-3.2.2-7.4.noarch.rpm"
RPM_HASH = "845a213cacbd97697e295e490c2058e45b56560588e743efaa1c7a9b36018f4f749c58244658f384dbcfa9e3b4cd53ac2cfd59977b2c4fe7f60091fb3688605e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections \
commons-collections \
jakarta-commons-collections \
mvn(commons-collections:commons-collections) \
mvn(commons-collections:commons-collections:pom:) \
mvn(org.apache.commons:commons-collections) \
mvn(org.apache.commons:commons-collections:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

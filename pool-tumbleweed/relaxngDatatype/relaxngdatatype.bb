SUMMARY = "RELAX NG Datatype API"
DESCRIPTION = "RELAX NG is a public space for test cases and other ancillary software \
related to the construction of the RELAX NG language and its \
implementations."
LICENSE = "BSD-3-Clause"

PV = "2011.1"

RPM_NAME = "relaxngDatatype-2011.1-5.6.noarch.rpm"
RPM_HASH = "25d7d8ff316346d1319227560b4a5df2c4fe2b1e1df47351f982919f58a1c632f2c9ac98665e7fdd07be478c85da6c9874b001e150445203fda8bebf19831290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.github.relaxng:relaxngDatatype) \
mvn(com.github.relaxng:relaxngDatatype:pom:) \
mvn(relaxngDatatype:relaxngDatatype) \
mvn(relaxngDatatype:relaxngDatatype:pom:) \
relaxngDatatype"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

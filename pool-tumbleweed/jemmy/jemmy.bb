SUMMARY = "Java UI testing library"
DESCRIPTION = "Jemmy is a Java UI testing library. Jemmy represents the most natural way to \
test Java UI - perform the testing right from the Java code. Jemmy is a Java \
library which provides clear and straightforward API to access Java UI. Tests \
are then just java programs, which use the API. Having the tests in Java allows \
to use all the flexibility of high level language to capture test logic and \
also do any other operations needed to be done from test."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-2.3.0.0-26.6.noarch.rpm"
RPM_HASH = "021464eff5423c838520f23fc08dedb5e5309244d82070ca0123eebde43b5c38dbce2116ac506f2f9754eb03dde6d1f974ada80e5c16c3e33da7dae3160aa9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy \
mvn(org.netbeans:jemmy) \
mvn(org.netbeans:jemmy:pom:)"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

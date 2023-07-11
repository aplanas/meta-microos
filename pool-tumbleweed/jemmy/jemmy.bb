SUMMARY = "Java UI testing library"
DESCRIPTION = "Jemmy is a Java UI testing library. Jemmy represents the most natural way to \
test Java UI - perform the testing right from the Java code. Jemmy is a Java \
library which provides clear and straightforward API to access Java UI. Tests \
are then just java programs, which use the API. Having the tests in Java allows \
to use all the flexibility of high level language to capture test logic and \
also do any other operations needed to be done from test."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-2.3.0.0-26.7.noarch.rpm"
RPM_HASH = "90f4b37dd8db98ccc389934f3a30fcde2047a0385d5a1f2bea37f980a9d275315b9ee650fd51f9d0464e8f8c013c52d0c40b358c8f2a0e9520c5290fd66036c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy \
mvn-org.netbeans-jemmy \
mvn-org.netbeans-jemmy-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

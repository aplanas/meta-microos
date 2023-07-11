SUMMARY = "Parent POM of ongres-scram"
DESCRIPTION = "This package contains the ongres-scram parent POM."
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-parent-2.1-2.11.noarch.rpm"
RPM_HASH = "8e5eb6cefc412d7aea1022db0e92bc972d05295e5404f60a6f8ce55242bdf6370e76ac2d20f8110485a4c9f1ae1d5f18ecbe619f412f56064bf5d08e680e67cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.scram-parent-pom- \
ongres-scram-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin"

inherit rpm

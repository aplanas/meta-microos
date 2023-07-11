SUMMARY = "TreeLayout Core Demo"
DESCRIPTION = "Demo for 'org.abego.treelayout.core'."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-demo-1.0.3-3.11.noarch.rpm"
RPM_HASH = "ce4ecc9d3cc8341174768b908e1815f071dc35c1e3ce6aa9a0483ac6cd5cfb2c65e2ad434b583b02617df4d0e2aa8789cae2cb577d8fb5c2e9fc4425f81bbe3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.demo \
mvn-org.abego.treelayout-org.abego.treelayout.demo-pom- \
treelayout-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.abego.treelayout-org.abego.treelayout.core"

inherit rpm

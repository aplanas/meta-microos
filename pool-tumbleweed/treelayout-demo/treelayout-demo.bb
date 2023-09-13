SUMMARY = "TreeLayout Core Demo"
DESCRIPTION = "Demo for 'org.abego.treelayout.core'."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-demo-1.0.3-4.1.noarch.rpm"
RPM_HASH = "3caa1c87c74cdc4161bb4d6572ebf06ddbce776fbf640993751187bcead4be8ba0e9bff4fd76d643cc165b8e4b3abc667e6686e95b521210177771fe80a2527b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.demo \
mvn-org.abego.treelayout-org.abego.treelayout.demo-pom- \
treelayout-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.abego.treelayout-org.abego.treelayout.core"

inherit rpm

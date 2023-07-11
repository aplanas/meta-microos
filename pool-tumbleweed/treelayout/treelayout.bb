SUMMARY = "Efficient and customizable Tree Layout Algorithm in Java"
DESCRIPTION = "Efficiently create compact, highly customizable \
tree layouts. The software builds tree layouts \
in linear time. I.e. even trees with many nodes \
are built fast."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-1.0.3-3.11.noarch.rpm"
RPM_HASH = "70f96cec5b8578a2362a137b27c62a0a3126ad4a44732f25398ac11f79d25ea21c3ececf14e14ea7dfb142541ddb02add734e8d7ebd87dfd8787f5618a47eb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.core \
mvn-org.abego.treelayout-org.abego.treelayout.core-pom- \
osgi-org.abego.treelayout.core \
treelayout"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

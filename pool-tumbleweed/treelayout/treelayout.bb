SUMMARY = "Efficient and customizable Tree Layout Algorithm in Java"
DESCRIPTION = "Efficiently create compact, highly customizable \
tree layouts. The software builds tree layouts \
in linear time. I.e. even trees with many nodes \
are built fast."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-1.0.3-4.1.noarch.rpm"
RPM_HASH = "a2014648f6cb8b86e3ebd9d8d53a0959b465074315d7805f643388f3a93b16a0ccd71f06356905bccc73eaa47c17fe91a41d15f3e39c669eb82b1fb242943687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.core \
mvn-org.abego.treelayout-org.abego.treelayout.core-pom- \
osgi-org.abego.treelayout.core \
treelayout"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

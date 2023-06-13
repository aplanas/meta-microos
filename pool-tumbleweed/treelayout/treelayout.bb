SUMMARY = "Efficient and customizable Tree Layout Algorithm in Java"
DESCRIPTION = "Efficiently create compact, highly customizable \
tree layouts. The software builds tree layouts \
in linear time. I.e. even trees with many nodes \
are built fast."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-1.0.3-3.10.noarch.rpm"
RPM_HASH = "d8611a4a782b3952215e4bd5eb090e812c333394511a8cad866da99d0c2932049e63641b96547c95280dd165394a0a1b10c3f9f89e6d0f359f6241821f792a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.abego.treelayout:org.abego.treelayout.core) \
mvn(org.abego.treelayout:org.abego.treelayout.core:pom:) \
osgi(org.abego.treelayout.core) \
treelayout"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "Java-based Diagram Component and Editor"
DESCRIPTION = "Jgraphx is the a lightweight and feature-rich graph component for Java, \
and the successor to jgraph. It provides automatic 2D layout and routing \
for diagrams. Object and relations can be displayed in any Swing UI \
via provided zoomable component."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-4.2.2-2.6.noarch.rpm"
RPM_HASH = "02c68d52aae94a5f70b5aaaf8f061f93bd2d624b989f54b7faff49d8ef53a85fb24d857c0c49d46fb18a55a4f7278f78e0631ccd15982b48667991fb6af22c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx \
mvn-com.mxgraph-jgraphx \
mvn-com.mxgraph-jgraphx-pom- \
osgi-com.mxgraph"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm

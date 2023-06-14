SUMMARY = "Java-based Diagram Component and Editor"
DESCRIPTION = "Jgraphx is the a lightweight and feature-rich graph component for Java, \
and the successor to jgraph. It provides automatic 2D layout and routing \
for diagrams. Object and relations can be displayed in any Swing UI \
via provided zoomable component."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-4.2.2-2.5.noarch.rpm"
RPM_HASH = "7f0930445ee6da49ce2295574c678309c67098288ea45a5f033dd2d32d21c3e70306626bec61970c6dbb39dea4232a6e75da32856fdbdc87f570715c03d26f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx \
mvn-com.mxgraph-jgraphx \
mvn-com.mxgraph-jgraphx-pom- \
osgi-com.mxgraph"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm

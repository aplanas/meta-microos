SUMMARY = "Eclipse GEF SDK"
DESCRIPTION = "Documentation and source for the Eclipse Graphical Editing Framework (GEF)."
LICENSE = "EPL-1.0"

PV = "3.11.0"

RPM_NAME = "eclipse-gef-sdk-3.11.0-2.8.noarch.rpm"
RPM_HASH = "fed1f2cf37071b8b291cadeea89e5e0118f5ecec06602f35d1f42d4f9d770daded462d9fcc7ef0e604ba7c03077e9c1a0196bfeb0a6b67440c0301520011cbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-gef-sdk \
mvn-org.eclipse.draw2d.features-org.eclipse.draw2d.sdk \
mvn-org.eclipse.draw2d.features-org.eclipse.draw2d.source \
mvn-org.eclipse.draw2d.plugins-org.eclipse.draw2d--sources- \
mvn-org.eclipse.draw2d.plugins-org.eclipse.draw2d.doc.isv \
mvn-org.eclipse.gef.features-org.eclipse.gef.sdk \
mvn-org.eclipse.gef.features-org.eclipse.gef.source \
mvn-org.eclipse.gef.plugins-org.eclipse.gef--sources- \
mvn-org.eclipse.gef.plugins-org.eclipse.gef.doc.isv \
mvn-org.eclipse.gef.plugins-org.eclipse.gef.examples.ui.pde \
mvn-org.eclipse.gef.plugins-org.eclipse.gef.examples.ui.pde--sources- \
mvn-org.eclipse.zest.features-org.eclipse.zest.sdk \
mvn-org.eclipse.zest.features-org.eclipse.zest.source \
mvn-org.eclipse.zest.plugins-org.eclipse.zest.core--sources- \
mvn-org.eclipse.zest.plugins-org.eclipse.zest.doc.isv \
mvn-org.eclipse.zest.plugins-org.eclipse.zest.layouts--sources- \
osgi-org.eclipse.draw2d.doc.isv \
osgi-org.eclipse.draw2d.sdk \
osgi-org.eclipse.draw2d.source \
osgi-org.eclipse.gef.doc.isv \
osgi-org.eclipse.gef.examples.ui.pde \
osgi-org.eclipse.gef.examples.ui.pde.source \
osgi-org.eclipse.gef.sdk \
osgi-org.eclipse.gef.source \
osgi-org.eclipse.zest.core.source \
osgi-org.eclipse.zest.doc.isv \
osgi-org.eclipse.zest.layouts.source \
osgi-org.eclipse.zest.sdk \
osgi-org.eclipse.zest.source"

RDEPENDS:${PN} += "eclipse-gef \
eclipse-pde \
java-headless \
javapackages-filesystem \
osgi-org.eclipse.draw2d \
osgi-org.eclipse.platform.doc.isv"

inherit rpm

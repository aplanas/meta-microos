SUMMARY = "Eclipse GEF Tests"
DESCRIPTION = "Tests for the Eclipse Graphical Editing Framework (GEF)."
LICENSE = "EPL-1.0"

PV = "3.11.0"

RPM_NAME = "eclipse-gef-tests-3.11.0-2.8.noarch.rpm"
RPM_HASH = "3a7aa0cedd5b233fc8d2a858dcf6607aa46e6d83ffd59e5f74d4ddf530d64e828905657d76535bc9e5a480456dd7a125b8f826f38b287e288e186e5503025b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-gef-tests \
mvn-org.eclipse.draw2d.plugins-org.eclipse.draw2d.tests \
mvn-org.eclipse.draw2d.plugins-org.eclipse.draw2d.tests--sources- \
mvn-org.eclipse.gef.plugins-org.eclipse.gef.tests \
mvn-org.eclipse.gef.plugins-org.eclipse.gef.tests--sources- \
mvn-org.eclipse.zest.plugins-org.eclipse.zest.tests \
mvn-org.eclipse.zest.plugins-org.eclipse.zest.tests--sources- \
osgi-org.eclipse.draw2d.tests \
osgi-org.eclipse.draw2d.tests.source \
osgi-org.eclipse.gef.tests \
osgi-org.eclipse.gef.tests.source \
osgi-org.eclipse.zest.tests \
osgi-org.eclipse.zest.tests.source"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.draw2d \
osgi-org.eclipse.gef \
osgi-org.eclipse.jdt \
osgi-org.eclipse.jdt.core \
osgi-org.eclipse.jdt.ui \
osgi-org.eclipse.pde \
osgi-org.eclipse.pde.ui \
osgi-org.eclipse.zest.core \
osgi-org.eclipse.zest.layouts \
osgi-org.junit"

inherit rpm

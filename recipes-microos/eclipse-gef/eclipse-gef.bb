SUMMARY = "Graphical Editing Framework (GEF) Eclipse plug-in"
DESCRIPTION = "The Graphical Editing Framework (GEF) allows developers to create a rich \
graphical editor from an existing application model. GEF is completely \
application neutral and provides the groundwork to build almost any \
application, including but not limited to: activity diagrams, GUI builders, \
class diagram editors, state machines, and even WYSIWYG text editors."
LICENSE = "EPL-1.0"

PV = "3.11.0"

RPM_NAME = "eclipse-gef-3.11.0-2.7.noarch.rpm"
RPM_HASH = "80fab57c12eb94e7377fcf17d63a2516e12e726e424996953c53b71d712e503574e13e58206c59156c1930c2943a2a660bf7828a44d362cd7650b417dc2b21bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-gef \
mvn(org.eclipse.draw2d.features:org.eclipse.draw2d) \
mvn(org.eclipse.draw2d.plugins:org.eclipse.draw2d) \
mvn(org.eclipse.gef.features:org.eclipse.gef) \
mvn(org.eclipse.gef.plugins:org.eclipse.gef) \
mvn(org.eclipse.zest.features:org.eclipse.zest) \
mvn(org.eclipse.zest.plugins:org.eclipse.zest.core) \
mvn(org.eclipse.zest.plugins:org.eclipse.zest.layouts) \
osgi(org.eclipse.draw2d) \
osgi(org.eclipse.gef) \
osgi(org.eclipse.zest) \
osgi(org.eclipse.zest.core) \
osgi(org.eclipse.zest.layouts)"
RDEPENDS:${PN} += "eclipse-platform \
java-headless \
javapackages-filesystem"

inherit rpm

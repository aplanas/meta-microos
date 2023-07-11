SUMMARY = "Eclipse EMF Core Bundles"
DESCRIPTION = " \
Core EMF bundles required by the Eclipse platform."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-core-2.22.0-3.6.aarch64.rpm"
RPM_HASH = "3b2aac863d6ed232f1ba010cb8e87028d1f7cdff51385c9a7f7d2cdbe2abedeaeacc10aa0d619d2914308f7dd9f59b4d00a99ff55d6de61d75c8411dc3e813d1"

RPROVIDES:${PN} += "eclipse-emf-core \
mvn-org.eclipse.emf-org.eclipse.emf.common \
mvn-org.eclipse.emf-org.eclipse.emf.ecore \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.change \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.xmi \
mvn-org.eclipse.emf.features-org.eclipse.emf.common \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore \
osgi-org.eclipse.emf.common \
osgi-org.eclipse.emf.ecore \
osgi-org.eclipse.emf.ecore.change \
osgi-org.eclipse.emf.ecore.xmi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-javax.xml"

inherit rpm

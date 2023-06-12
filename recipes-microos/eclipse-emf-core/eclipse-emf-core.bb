SUMMARY = "Eclipse EMF Core Bundles"
DESCRIPTION = " \
Core EMF bundles required by the Eclipse platform."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-core-2.22.0-3.5.aarch64.rpm"
RPM_HASH = "a62692fa1a0519ef4d09ecce07e6888c569aef25de1a7d05dedfe1c88c1bae885a5c4ce0ffb084d1b4add6f783a0c55df6e705bb0f1e63b2b7726286c5499dc3"

RPROVIDES:${PN} += "eclipse-emf-core \
eclipse-emf-core(aarch-64) \
mvn(org.eclipse.emf.features:org.eclipse.emf.common) \
mvn(org.eclipse.emf.features:org.eclipse.emf.ecore) \
mvn(org.eclipse.emf:org.eclipse.emf.common) \
mvn(org.eclipse.emf:org.eclipse.emf.ecore) \
mvn(org.eclipse.emf:org.eclipse.emf.ecore.change) \
mvn(org.eclipse.emf:org.eclipse.emf.ecore.xmi) \
osgi(org.eclipse.emf.common) \
osgi(org.eclipse.emf.ecore) \
osgi(org.eclipse.emf.ecore.change) \
osgi(org.eclipse.emf.ecore.xmi)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi(javax.xml)"

inherit rpm

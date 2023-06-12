SUMMARY = "Eclipse EMF Core Bundles"
DESCRIPTION = " \
 \
 \
 \
Core EMF bundles required by the Eclipse platform."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-core-bootstrap-2.22.0-3.5.aarch64.rpm"
RPM_HASH = "106c82625b2b06a2d31947af092afa7d6d06abb1712085e6139a4914d0c131c0d93d1df6cc703e55d4084b338d63c556d530b6a9d9f2d3a25af78afe9f24b5cd"

RPROVIDES:${PN} += "eclipse-emf-core-bootstrap \
eclipse-emf-core-bootstrap(aarch-64) \
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
osgi(javax.xml) \
osgi(org.eclipse.core.resources) \
osgi(org.eclipse.core.runtime) \
osgi(org.eclipse.osgi)"

inherit rpm

SUMMARY = "Eclipse EMF Core Bundles"
DESCRIPTION = " \
 \
 \
 \
Core EMF bundles required by the Eclipse platform."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-core-bootstrap-2.22.0-3.6.aarch64.rpm"
RPM_HASH = "c03c3b396e4e6dd798975065e61f604338441ff8905bab8a42ff3a5a91e9a0c96f8ef9458ccab9ff1a885d166db0e6deaa50a1f521074cdf77e571bd73f8ebf7"

RPROVIDES:${PN} += "eclipse-emf-core-bootstrap \
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
osgi-javax.xml \
osgi-org.eclipse.core.resources \
osgi-org.eclipse.core.runtime \
osgi-org.eclipse.osgi"

inherit rpm

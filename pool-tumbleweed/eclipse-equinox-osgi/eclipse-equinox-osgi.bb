SUMMARY = "Eclipse OSGi - Equinox"
DESCRIPTION = " \
Eclipse OSGi - Equinox"
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-equinox-osgi-4.15-9.4.aarch64.rpm"
RPM_HASH = "1209fb7802633035949107afa8e801520ca3107129763a2217f173422ac932d202c3821f3ebce54db17b47f02677cebe64f18bbffd1be1a2b32e131d97d7dee4"

RPROVIDES:${PN} += "eclipse-equinox-osgi \
mvn-org.eclipse.osgi-org.eclipse.osgi \
mvn-org.eclipse.osgi-org.eclipse.osgi.compatibility.state \
mvn-org.eclipse.osgi-org.eclipse.osgi.services \
mvn-org.eclipse.osgi-org.eclipse.osgi.util \
mvn-org.eclipse.osgi-osgi \
mvn-org.eclipse.osgi-osgi.compatibility.state \
mvn-org.eclipse.osgi-osgi.services \
mvn-org.eclipse.osgi-osgi.util \
mvn-org.eclipse.platform-org.eclipse.osgi \
mvn-org.eclipse.platform-org.eclipse.osgi.compatibility.state \
mvn-org.eclipse.platform-org.eclipse.osgi.services \
mvn-org.eclipse.platform-org.eclipse.osgi.util \
osgi-org.eclipse.osgi \
osgi-org.eclipse.osgi.compatibility.state \
osgi-org.eclipse.osgi.services \
osgi-org.eclipse.osgi.util \
osgi-system.bundle"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

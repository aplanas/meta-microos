SUMMARY = "Eclipse OSGi - Equinox"
DESCRIPTION = " \
Eclipse OSGi - Equinox"
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-equinox-osgi-4.15-9.3.aarch64.rpm"
RPM_HASH = "a5086d3ecb8100fdf6907d63b97f90cf6ddb3a3301997f365d17fce3e9e4c722a133678d9bc327a729768781d147dd6bcc73dba84eb542737a291f9690af7b15"

RPROVIDES:${PN} += "eclipse-equinox-osgi \
eclipse-equinox-osgi(aarch-64) \
mvn(org.eclipse.osgi:org.eclipse.osgi) \
mvn(org.eclipse.osgi:org.eclipse.osgi.compatibility.state) \
mvn(org.eclipse.osgi:org.eclipse.osgi.services) \
mvn(org.eclipse.osgi:org.eclipse.osgi.util) \
mvn(org.eclipse.osgi:osgi) \
mvn(org.eclipse.osgi:osgi.compatibility.state) \
mvn(org.eclipse.osgi:osgi.services) \
mvn(org.eclipse.osgi:osgi.util) \
mvn(org.eclipse.platform:org.eclipse.osgi) \
mvn(org.eclipse.platform:org.eclipse.osgi.compatibility.state) \
mvn(org.eclipse.platform:org.eclipse.osgi.services) \
mvn(org.eclipse.platform:org.eclipse.osgi.util) \
osgi(org.eclipse.osgi) \
osgi(org.eclipse.osgi.compatibility.state) \
osgi(org.eclipse.osgi.services) \
osgi(org.eclipse.osgi.util) \
osgi(system.bundle)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

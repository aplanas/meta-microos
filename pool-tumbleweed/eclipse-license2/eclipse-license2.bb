SUMMARY = "Shared EPL v2.0 license feature for Eclipse"
DESCRIPTION = "Shared license feature for Eclipse. Other features may consume this \
feature to avoid unnecessary duplication of license boiler plate."
LICENSE = "EPL-2.0"

PV = "2.0.2"

RPM_NAME = "eclipse-license2-2.0.2-5.6.noarch.rpm"
RPM_HASH = "ce53b34a7ffb204bc5fda4eae32df1899592bd5e38981b7b37ac37b980b2438e61fd97fb4b30a5d200deb13b8229688e603b0512eee050d16fb9d93d6f454a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-license2 \
mvn-org.eclipse.license-org.eclipse.license \
osgi-org.eclipse.license"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

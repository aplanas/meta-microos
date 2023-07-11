SUMMARY = "Javadoc for felix-osgi-obr"
DESCRIPTION = "API documentation for felix-osgi-obr."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-javadoc-1.0.2-1.7.noarch.rpm"
RPM_HASH = "6858c0c65e6f2084583b8e6766ba65f556490b5b89f11d329249d4b498a9657008e8a95a2ee22373e29e98fbe227b2c2bf9ab8ad257759912e56ab4310005efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

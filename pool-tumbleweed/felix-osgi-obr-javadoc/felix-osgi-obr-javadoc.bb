SUMMARY = "Javadoc for felix-osgi-obr"
DESCRIPTION = "API documentation for felix-osgi-obr."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-javadoc-1.0.2-1.6.noarch.rpm"
RPM_HASH = "2e0254036f12d486301a926cd81d3a43fe76aa71c941dee3b825a72ea982c4636d1aba62d5045664867284eb5becb0d8b5c572d4416da82f6708e07f4d7af26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

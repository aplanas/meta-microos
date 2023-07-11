SUMMARY = "Javadoc for maven-doxia-sitetools"
DESCRIPTION = "API documentation for maven-doxia-sitetools."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "maven-doxia-sitetools-javadoc-1.9.2-4.9.noarch.rpm"
RPM_HASH = "7b5563c2857274844e11df53ddc4045c7b640ff2eef91998ced1b3fe34924fd5061cbc2b77a56fbd823aa474bf4b1537eced6dc4119d9dfd0f8a86cbdddf5e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sitetools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for felix-gogo-shell"
DESCRIPTION = "This package contains the API documentation for felix-gogo-shell."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-javadoc-1.1.4-2.1.noarch.rpm"
RPM_HASH = "8826cf03b073d7d8205ff15688ed1b5011a07ee0d729b498af3ebec937fd045a01ff9252c03a9681fac2461a28d5e2561ec32044e449aabab4e8461c34e8620c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

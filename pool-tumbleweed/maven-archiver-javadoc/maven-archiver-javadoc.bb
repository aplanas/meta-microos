SUMMARY = "Javadoc for maven-archiver"
DESCRIPTION = "Javadoc for maven-archiver."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-archiver-javadoc-3.5.0-2.13.noarch.rpm"
RPM_HASH = "9337933da904fdf550bedb4ce485678cd25f29165a73151351e13a3fa29e41a0de4c9e9a14e0290b26099ec8ac4e3f422fee903b09dd238e4802907ca3e4a333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

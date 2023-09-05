SUMMARY = "Javadoc for jdom2"
DESCRIPTION = "This package contains javadoc for jdom2."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-javadoc-2.0.6.1-2.1.noarch.rpm"
RPM_HASH = "3574ccbd54af8e7153d271c3874bd85e1cdb8afb6921fe351484cef2ebaf20e9250c63f54bec098304d3228bc5ae52ec1d06883cd61ee7e817dee1a6d2033022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

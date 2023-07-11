SUMMARY = "Javadocs for tycho"
DESCRIPTION = "This package contains the API documentation for tycho."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.6.0"

RPM_NAME = "tycho-javadoc-1.6.0-6.7.noarch.rpm"
RPM_HASH = "7366a82a2e389520054ff9d9b6a62ab734baf9cbef95f3d634b660b1b55798074253bc7644406c7c802125cea1e8a08a029f7960baf5be39a08bdbfea1d3e873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tycho-extras-javadoc \
tycho-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

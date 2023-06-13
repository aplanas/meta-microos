SUMMARY = "Javadocs for jnr-process"
DESCRIPTION = "This package contains the API documentation for jnr-process."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-javadoc-0.4.12-1.1.noarch.rpm"
RPM_HASH = "84b086f88d54606cf54d05fe9e83a38b1e3f1b65d56b7d66ead7850ef5f5c558e8913703a27173be3d9ba612fcdd0694002217de5c1088d7b1128171ae8a2d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-process-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

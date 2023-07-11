SUMMARY = "Javadoc for plexus-component-api"
DESCRIPTION = "API documentation for plexus-component-api."
LICENSE = "Apache-2.0"

PV = "1.0~alpha15"

RPM_NAME = "plexus-component-api-javadoc-1.0~alpha15-2.7.noarch.rpm"
RPM_HASH = "098fadd878ec3515e35b90afd6997323d42b33e3fd2e61dd6dde3159265ba0ddc2bd2b899c1b3948b0c37890b3d8470fba03c58a2fd36ae20a36086991ea9bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-component-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

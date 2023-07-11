SUMMARY = "Javadoc for cdi-api"
DESCRIPTION = "This package contains the API documentation for cdi-api."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-javadoc-2.0.2-2.4.noarch.rpm"
RPM_HASH = "1eeb5dc6e31b33f4d27444a0420d789daa8261c49dc1f3f4fcd41f30c985ffe897a78cbebd6fc149792785d8cfc28d481e8963d2e71659712f6a2fa46c112444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

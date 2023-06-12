SUMMARY = "Javadoc for auto"
DESCRIPTION = "This package contains javadoc for auto."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-javadoc-1.6.1-1.10.noarch.rpm"
RPM_HASH = "21da3fc8b949c5d8196ee8d2899e490c509ed0f48e210e2ca788afbfeb6a831f3e976dc9a009a281ff33ad0517b8c476a2fb6f5c49e000fb07f2b47ce2ceb8e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

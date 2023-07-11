SUMMARY = "Javadocs for xml-maven-plugin"
DESCRIPTION = "This package contains the API documentation for xml-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-javadoc-1.0.2-2.11.noarch.rpm"
RPM_HASH = "ec1f567cbc1dae92b2e35ca76c64b2b3b0f3f88ddc8d01cfe2bcb66c06a5fb931f626e64f844ce023b56b1f6bacbdb514db3b12b5fdc924f1467f82e7df306a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

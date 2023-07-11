SUMMARY = "Javadocs for mockito"
DESCRIPTION = "This package contains the API documentation for mockito."
LICENSE = "MIT"

PV = "1.10.19"

RPM_NAME = "mockito-javadoc-1.10.19-5.8.noarch.rpm"
RPM_HASH = "f0d30343d136b089a9f4fa48ff3184f100ff470bc2e91037f7642812cc7a6cfdfa049713346cc2918597b8931aa40e05bf4447c43ca13e2d5b3444f371b5f0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

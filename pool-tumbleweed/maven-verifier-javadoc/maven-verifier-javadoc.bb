SUMMARY = "Javadoc for maven-verifier"
DESCRIPTION = "API documentation for maven-verifier."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-javadoc-1.6-3.13.noarch.rpm"
RPM_HASH = "07e9b1b764cebf4d855277f44643da20251412bd1d16ce5b619fb83378c56f5fef462f12a96ab0aba979317ad154646e1576563d7cd3e340a66a212acdebde0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

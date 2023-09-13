SUMMARY = "Javadoc for maven-shared-io"
DESCRIPTION = "API documentation for maven-shared-io."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-javadoc-3.0.0-3.1.noarch.rpm"
RPM_HASH = "8d104dc51f32260db1b7c0a0aeb5fd8ed7bf64abf4e2bcd35da096b48f9832504b5d51209d4ae1047f27ef88e56a1d47f89e9d441712e323b46d4a09cd7a2dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

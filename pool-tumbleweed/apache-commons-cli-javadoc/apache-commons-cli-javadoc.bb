SUMMARY = "Javadoc for apache-commons-cli"
DESCRIPTION = "This package contains the API documentation for apache-commons-cli."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-cli-javadoc-1.5.0-1.8.noarch.rpm"
RPM_HASH = "5cb4334e72e8c8e6235edbb87d4bf737dca0e738f080dae1f52264df0930eb394fd6317bc53103ce17e5fa02497cee94848d039f8971d7591fa508b86a1bea11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-cli-javadoc \
jakarta-commons-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

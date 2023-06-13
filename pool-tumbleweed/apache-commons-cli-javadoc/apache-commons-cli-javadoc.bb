SUMMARY = "Javadoc for apache-commons-cli"
DESCRIPTION = "This package contains the API documentation for apache-commons-cli."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-cli-javadoc-1.5.0-1.7.noarch.rpm"
RPM_HASH = "e0f86ddcdeb7418b5a6543676628c72d91895f1ee7bde045ad3f2c6a560a284645f871068c14fc5631f9370c37e161ca200485d3e9a3bc0d2a85b70173b825a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-cli-javadoc \
jakarta-commons-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

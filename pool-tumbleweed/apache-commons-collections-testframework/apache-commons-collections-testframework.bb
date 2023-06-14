SUMMARY = "Test framework for apache-commons-collections"
DESCRIPTION = "Test framework for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-testframework-3.2.2-7.4.noarch.rpm"
RPM_HASH = "dfb7cb8cc103e2f9912dbaf6ac1966401e7122ae29f6e54f935d0f5367f2d3c8e6913bfebc0816044cc7824cb1db57ecf6fe8987cf23bae9ae30e412866de9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-testframework \
mvn-commons-collections-commons-collections-testframework \
mvn-org.apache.commons-commons-collections-testframework"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

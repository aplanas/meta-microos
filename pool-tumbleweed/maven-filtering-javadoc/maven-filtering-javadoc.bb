SUMMARY = "Javadoc for maven-filtering"
DESCRIPTION = "This package contains the API documentation for maven-filtering."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-filtering-javadoc-3.2.0-2.7.noarch.rpm"
RPM_HASH = "a6192ff7c0f02b20b87d7aba5e1e74f45e8849a71637170e95552fcd8869cbd4fa4340eb63a693ba4b6a0727a5d54b4ab90ad84d42f90c1241330c5bc525792b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

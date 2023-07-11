SUMMARY = "Javadoc for objenesis"
DESCRIPTION = "This package contains the API documentation for objenesis."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "objenesis-javadoc-3.1-2.7.noarch.rpm"
RPM_HASH = "6b35a0e14186a12d7fe940a89d308b7d6f3ce9dafa7ad5e1f1f7c2b7e3cbc1e58c8b836b9b1abe8928e2586bd718eeba7843de33a211501ec10d571c764213bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objenesis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

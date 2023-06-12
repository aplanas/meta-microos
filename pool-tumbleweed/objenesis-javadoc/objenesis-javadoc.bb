SUMMARY = "Javadoc for objenesis"
DESCRIPTION = "This package contains the API documentation for objenesis."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "objenesis-javadoc-3.1-2.6.noarch.rpm"
RPM_HASH = "c2c2331cdeaf37cce0234d9e22402f527be7193c1f977f2d9cead3df3026421ac130a37fb02dd6cf40240256d36b0b18dfce6407d13021a6576b23e970e7a896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objenesis-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for apache-commons-math"
DESCRIPTION = "This package contains the API documentation for apache-commons-math."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-javadoc-3.6.1-7.8.noarch.rpm"
RPM_HASH = "b3d2faa277d1987c4e19d0264b1ee508b023f65cfe72fca90f8bb7ac5a8aa80765e4f597c94058b8871e11ee4114a77e0dd9aa7ceb593b74b9ba4c69303803e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

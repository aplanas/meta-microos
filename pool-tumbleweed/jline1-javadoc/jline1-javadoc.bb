SUMMARY = "API documentation for jline1"
DESCRIPTION = "This package contains the API documentation for jline1."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "jline1-javadoc-1.0-2.7.noarch.rpm"
RPM_HASH = "7603cf49b574df5b2e80fb025770223fa0a2f48da4b5897ac362bcaef292b677db2ce3f830bd563fc63028137f03fb3af4bcb994bfe6aeb554db39ae7b86f575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline1-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

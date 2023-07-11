SUMMARY = "Javadoc for parboiled-scala"
DESCRIPTION = "This package contains javadoc for parboiled-scala."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-scala-javadoc-1.1.6-5.7.noarch.rpm"
RPM_HASH = "aeb446fb11eadc8761026b86879b624f1e9727044b31eba95c6ca2fbf67b4c87ef9279cca9a6af864f87a6548d6f28978331c46e976c3c1d4cae24503fff8a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parboiled-scala-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

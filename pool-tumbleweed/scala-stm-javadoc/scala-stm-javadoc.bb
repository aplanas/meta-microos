SUMMARY = "Javadoc for scala-stm"
DESCRIPTION = "This package contains javadoc for scala-stm."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "scala-stm-javadoc-0.7-2.12.noarch.rpm"
RPM_HASH = "34c3a8c9e726bba5518df1b2060cb480ef13c0d6cf2d06003e4f259e610a5ef5f3a0874b78b260f1fa011dc77085b87967dfe1710f5376a69e1003a47c490734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-stm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

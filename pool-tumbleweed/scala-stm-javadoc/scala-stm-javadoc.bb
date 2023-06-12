SUMMARY = "Javadoc for scala-stm"
DESCRIPTION = "This package contains javadoc for scala-stm."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "scala-stm-javadoc-0.7-2.11.noarch.rpm"
RPM_HASH = "bb32e9976dd0cef98da2cceffbdfc03f97384c51cd6d7e7c0e92eec4cbf5b03620b423b72aecb3f21686ee9fa28171b6797aaf9117af814cc07e1998c4857500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-stm-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

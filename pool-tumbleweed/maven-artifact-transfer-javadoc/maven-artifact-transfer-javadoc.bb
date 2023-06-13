SUMMARY = "API documentation for maven-artifact-transfer"
DESCRIPTION = "This package provides API documentation for maven-artifact-transfer."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-javadoc-0.13.1-1.8.noarch.rpm"
RPM_HASH = "0b4bac7fae7a66889d46b39d8af44333798c753cb9cbffe76dd1c232be7a3bc12054e5594adfb37d089977cf6108daf4cd6ff12e531218b0efff7b965d59fc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

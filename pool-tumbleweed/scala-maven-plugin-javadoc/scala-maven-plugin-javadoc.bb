SUMMARY = "Javadoc for scala-maven-plugin"
DESCRIPTION = "This package contains javadoc for scala-maven-plugin."
LICENSE = "SUSE-Public-Domain"

PV = "3.4.6"

RPM_NAME = "scala-maven-plugin-javadoc-3.4.6-3.9.noarch.rpm"
RPM_HASH = "54ed843bc18fd3035a733c2a0c4ebdc3e476dfe03f9efb5f8fefec822bf20cb1b28c678a1c8a2d9c94f4d771d2c9334dd5a3fd7509445db32438820fa786a1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

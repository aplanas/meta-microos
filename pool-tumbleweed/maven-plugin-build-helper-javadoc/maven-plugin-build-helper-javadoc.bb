SUMMARY = "API documentation for maven-plugin-build-helper"
DESCRIPTION = "This package provides API documentation for maven-plugin-build-helper."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "maven-plugin-build-helper-javadoc-3.2.0-2.9.noarch.rpm"
RPM_HASH = "7adaa4fc3c884c533e7e0d83e7e305b78aa65c4ffde1db7d8704051493bb859b69c0d09611dfe14fae92c5d2c91ce246563fb44a0ecbe7b78bdd7b709ad378e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-build-helper-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

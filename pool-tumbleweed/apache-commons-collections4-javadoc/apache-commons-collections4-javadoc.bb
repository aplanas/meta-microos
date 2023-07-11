SUMMARY = "API documentation for apache-commons-collections4"
DESCRIPTION = "This package provides API documentation for apache-commons-collections4."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "apache-commons-collections4-javadoc-4.1-2.7.noarch.rpm"
RPM_HASH = "3661f8f61735ffaf32eeafb3c3defed2416a5c4617f19b95b148ee2dbd67e7dd956f309ed50c77e8ea24e67a22437ea03b13d740c42070b65404b4546b46b1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

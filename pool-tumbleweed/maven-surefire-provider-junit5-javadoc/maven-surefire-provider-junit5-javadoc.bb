SUMMARY = "Javadoc for maven-surefire-provider-junit5"
DESCRIPTION = "Javadoc for maven-surefire-provider-junit5."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit5-javadoc-2.22.0-8.1.noarch.rpm"
RPM_HASH = "fc8daae980a3f48293502ee41dc9a51e1b1a61a13bc4d2849b16e52e531c1f6a89606bf5c2f51c041897afac22f0d8beead67bc190314bf926195c8b13f48b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit5-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

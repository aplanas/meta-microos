SUMMARY = "Javadoc for maven-surefire-provider-junit5"
DESCRIPTION = "Javadoc for maven-surefire-provider-junit5."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit5-javadoc-2.22.0-8.2.noarch.rpm"
RPM_HASH = "192961acab39737d716749e42f52b1cb9a76bcf43651d04ca0c3ac5ecc6598f8dadcafea630e1dad9f6a116fa442889d15fc81efdf7ab2712f118fc305347a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit5-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

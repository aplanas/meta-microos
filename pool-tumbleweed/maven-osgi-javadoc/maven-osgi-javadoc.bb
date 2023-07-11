SUMMARY = "Javadoc for maven-osgi"
DESCRIPTION = "API documentation for maven-osgi."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "maven-osgi-javadoc-0.2.0-3.11.noarch.rpm"
RPM_HASH = "a0b2dca8bc19b13954a27cd8971da0a8423fe9551030c3ab6a5878edd36890b7703d8561586743b68c359a9c932d29125d96f400b510599235be0be0682ad857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

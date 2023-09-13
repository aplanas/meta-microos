SUMMARY = "Javadoc for maven-common-artifact-filters"
DESCRIPTION = "This package contains javadoc for maven-common-artifact-filters."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-common-artifact-filters-javadoc-3.3.2-2.1.noarch.rpm"
RPM_HASH = "204a10e061c7587495d43344f7e14c5f67afaade761223956fc32786a1f196b50337fe1ac39d914fd5d5ed23259be74143ffa20ab0f1b83a3e434f201e0de9ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for maven-plugin-tools"
DESCRIPTION = "API documentation for maven-plugin-tools."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-javadoc-3.6.0-7.1.noarch.rpm"
RPM_HASH = "5a236cff74f7fc564ffe68b96a944efaa6c4b27c41360fc4d882da35c9dc58fa2b7dae0da78e15fa638800e689a311ca06eb88dee94261b48eb7db10c9e7f1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-javadoc \
maven-plugin-tools-javadocs"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for maven-reporting-api"
DESCRIPTION = "API documentation for maven-reporting-api."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-api-javadoc-3.1.0-3.8.noarch.rpm"
RPM_HASH = "d4263aa37965e8e8f0040d2bcba14af900280dad9c9065691e3189260760509e13d6c27466b9423320b1f81274190487a22d592d8eeffebbea5189d8230171ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

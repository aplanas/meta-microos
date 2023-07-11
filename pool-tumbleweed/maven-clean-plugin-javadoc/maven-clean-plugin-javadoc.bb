SUMMARY = "API documentation for maven-clean-plugin"
DESCRIPTION = "This package provides API documentation for maven-clean-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-clean-plugin-javadoc-3.1.0-4.11.noarch.rpm"
RPM_HASH = "4731cb54660a5ec9878913dfab7441e7e87abd1d0e90907ed3d07867f51dc75dd2fc9798818ef2ac84a8c2301502fc883635a79e0eec04d3e4d864c81b753e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

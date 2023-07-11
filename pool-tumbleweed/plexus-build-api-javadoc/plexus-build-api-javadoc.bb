SUMMARY = "Javadoc for plexus-build-api"
DESCRIPTION = "API documentation for plexus-build-api."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "plexus-build-api-javadoc-0.0.7-4.5.noarch.rpm"
RPM_HASH = "2a782601b486975dea276bad9202ea63aa570504d5b6410839b54e2653c33ceb4b151453dbc14ec20f1f76556c43071bdbcf97cdb0a6afb2d2714029cfb7e356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-build-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

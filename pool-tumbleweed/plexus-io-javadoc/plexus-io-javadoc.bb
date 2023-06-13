SUMMARY = "Javadoc for plexus-io"
DESCRIPTION = "API documentation for plexus-io."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "plexus-io-javadoc-3.2.0-2.8.noarch.rpm"
RPM_HASH = "cd3708ddea352ba10a076563124bc48578621a4440b254ad3a8bef14c63c1470dc5361104c1f8fa1f68f54ad4c0f3226e430968b60c52155d3913b2893ff1141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

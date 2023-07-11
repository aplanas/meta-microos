SUMMARY = "Javadoc for plexus-cli"
DESCRIPTION = "Javadoc for plexus-cli."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "plexus-cli-javadoc-1.6-5.5.noarch.rpm"
RPM_HASH = "56a41245498666baaf146aad43ebac5ca55a77ec991b386dd34a20c4248c5b1e301009980249ac957422df392c4e1b1bf89d0399556f142edcfb3b08a3869ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

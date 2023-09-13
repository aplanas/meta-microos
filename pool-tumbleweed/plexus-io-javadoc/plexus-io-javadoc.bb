SUMMARY = "Javadoc for plexus-io"
DESCRIPTION = "API documentation for plexus-io."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "plexus-io-javadoc-3.4.1-1.1.noarch.rpm"
RPM_HASH = "00e40483452e93488d068e7e949d16a615fb992ba2d7265cc56ee971dd4d9f873043cdd294a385eceb61a3df521e5090d4ca2b776f2be5d4b6102a1a1a440ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

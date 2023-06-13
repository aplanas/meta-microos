SUMMARY = "Javadoc for plexus-classworlds"
DESCRIPTION = "API documentation for plexus-classworlds."
LICENSE = "Apache-2.0 & Plexus"

PV = "2.6.0"

RPM_NAME = "plexus-classworlds-javadoc-2.6.0-1.4.noarch.rpm"
RPM_HASH = "ad9772eee4118f3e794ba507319e6665f2722be992b38b01153cd0b9b8c0a2c3d54271a38f299ddf6f49589afdbe17bd5bb52fd8f462c14d2597030d85d2c185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-classworlds-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

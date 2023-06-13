SUMMARY = "API documentation for all plexus-containers packages"
DESCRIPTION = "API documentation for all plexus-containers packages."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-javadoc-2.1.1-4.1.noarch.rpm"
RPM_HASH = "adc184d604457fc1a3daa163da92ad7eb6aa61c7215af783e2bdd84f8e3445334b39bcbbd029274ab47f2a7fe098bfa21943bdb340d2aa47031aae8c189ba958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-containers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

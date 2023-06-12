SUMMARY = "Javadoc for jeromq"
DESCRIPTION = "This package contains the API documentation for jeromq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-javadoc-0.5.2-1.7.noarch.rpm"
RPM_HASH = "ac7e5f2d6c12ae7a94f587e17f899538984a372f5708fbb48190e01c8feceb9a20579832fdb4dac5df699d29e7d225f1ca73797abb2ad724cd287a8054a31837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadocs for jettison"
DESCRIPTION = "This package contains the API documentation for jettison."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-javadoc-1.5.4-2.1.noarch.rpm"
RPM_HASH = "702af744316474d084d46584b1addf21a4b1a09f5b0007286345384b0bc529e25258aecb144cb0d2e513475c82360a2a9b9346b7ac8ed777718773b304396f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

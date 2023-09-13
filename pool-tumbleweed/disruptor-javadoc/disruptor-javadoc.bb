SUMMARY = "Javadoc for disruptor"
DESCRIPTION = "This package contains javadoc for disruptor."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-javadoc-3.4.4-2.1.noarch.rpm"
RPM_HASH = "28e855df0fce9a6c1df27efeee38f0673fcf971fbf594c5c672884142c1f03290b63eb40a206ef7ddf91c12809dc3173258fba809aa8456d4ed64c4a05ffc972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

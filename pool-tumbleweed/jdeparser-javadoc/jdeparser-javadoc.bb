SUMMARY = "Javadoc for jdeparser"
DESCRIPTION = "This package contains the API documentation for jdeparser."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-javadoc-2.0.3-1.18.noarch.rpm"
RPM_HASH = "a2ae6146c92b24617969a9d554f0401a79f6cc36485745d99f39344e5dbedb671e916fc635c2635bfa8a004b7b39170889d4d7ed00dd628d2d3802d5919a190a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

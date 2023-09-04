SUMMARY = "Javadoc for jackson-modules-base"
DESCRIPTION = "This package contains API documentation for jackson-modules-base."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-modules-base-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "16a1b70de1efb0fb18a4aeac53b0d4bb61d462628970fd928aea2cc38e0324b892c4f0a2c4019e45722ce8900cd618c2ae61747ee7f7bf4ba4a28eb1bbf04534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

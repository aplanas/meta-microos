SUMMARY = "API documentation for osgi-core"
DESCRIPTION = "This package provides API documentation for osgi-core."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-javadoc-8.0.0-2.1.noarch.rpm"
RPM_HASH = "53f852a8ab4555e1f621f914207ce4e9d8abfe736a47d95c9800cddda79bd3752805d2523cfd605770908063b101c5e07d2ef1ea5ecf4a539cd048c682c93467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

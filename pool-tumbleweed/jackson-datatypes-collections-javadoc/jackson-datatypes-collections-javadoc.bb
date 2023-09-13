SUMMARY = "Javadoc for jackson-datatypes-collections"
DESCRIPTION = "This package contains API documentation for jackson-datatypes-collections."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatypes-collections-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "92aca6af2817dfc57deecd6c2c89894789e022a3cc5c8f9c05f43dee214e47f4aa20f90cc6e2cf8811b40fbf4452648da50d1c3e4f183f307849b2f3d7818c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

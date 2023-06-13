SUMMARY = "Javadoc for jnacl"
DESCRIPTION = "This package contains API documentation for jnacl."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-javadoc-1.0.0-1.7.noarch.rpm"
RPM_HASH = "d15c03833845a0bec2204679bfb94859e18710cd746d41c048913b9873bdd8e0145bbaddcefdc362dbc6121900efb307b068bb4fc442185c1acb40df80e2851c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for maven-archiver"
DESCRIPTION = "Javadoc for maven-archiver."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-archiver-javadoc-3.5.0-2.12.noarch.rpm"
RPM_HASH = "8b39ef5cc72fb531f948eca720878ecca98a5953511a37b99368322381277cc38bcf897994fa6f5ee575b08327b6ecc745ea83face2f8078369acd2f48bc281f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

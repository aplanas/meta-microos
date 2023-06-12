SUMMARY = "Javadoc for plexus-utils"
DESCRIPTION = "Javadoc for plexus-utils."
LICENSE = "Apache-1.1 & Apache-2.0 & xpp & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.5.1"

RPM_NAME = "plexus-utils-javadoc-3.5.1-1.1.noarch.rpm"
RPM_HASH = "7026b86765187b61a012c6dc1db9651cd1c4d706e45624ab68b9a647f49cbb7deab27c2951694a0686429d1e984959559b912750f07cd0c1ffd65a66aee66d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-utils-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

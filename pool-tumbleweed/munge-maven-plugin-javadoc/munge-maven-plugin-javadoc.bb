SUMMARY = "API documentation for munge-maven-plugin"
DESCRIPTION = "This package provides API documentation for munge-maven-plugin."
LICENSE = "CDDL-1.0"

PV = "1.0"

RPM_NAME = "munge-maven-plugin-javadoc-1.0-2.10.noarch.rpm"
RPM_HASH = "836ddbe15d22c65bd19de94af3e666d80995c11fbfe5a99f94aa959c7a264d820241ff40eb18f6da3718a33a39f7912262582165f304afff6e5ef9ae32a30fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "munge-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

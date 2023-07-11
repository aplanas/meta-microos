SUMMARY = "Javadoc for nekohtml"
DESCRIPTION = "Javadoc for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-javadoc-1.9.22.noko2-1.5.noarch.rpm"
RPM_HASH = "f8529fbcfab4e24ba5b9dd381009b894db9967432928afb8e964d6b3f121237c632a2a5d6bfaf132ea89eca2060ddc4a6f7a4c66c3b61f97be63e10b3fb7a787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nekohtml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

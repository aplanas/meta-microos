SUMMARY = "Javadoc for jetbrains-annotations"
DESCRIPTION = "This package contains javadoc for jetbrains-annotations."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-javadoc-23.0.0-1.4.noarch.rpm"
RPM_HASH = "5bf9fba296ee3b9077564be991700a3def1858a24f99be9c30cbcc20620bbe7ab25be5a9c1bb0d121e06e080676a12d29a267b6ef29ebd0aca133a8bd98b1f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

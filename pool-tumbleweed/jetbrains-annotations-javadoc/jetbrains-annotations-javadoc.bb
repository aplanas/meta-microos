SUMMARY = "Javadoc for jetbrains-annotations"
DESCRIPTION = "This package contains javadoc for jetbrains-annotations."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-javadoc-23.0.0-1.3.noarch.rpm"
RPM_HASH = "9d3c9ce32d1802984b6f4e3bde8940137b0a937a51a5f7949e8c2f2c400ce6da3c86af998a1391c2630ad978de6a74f34b9e3fff4bb53b3a6e342838fab33c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for sac"
DESCRIPTION = "Javadoc for sac."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-javadoc-1.3-12.1.noarch.rpm"
RPM_HASH = "9cbce6d6c57651002547a3a16af6c52448c6203dea232dcc84007811d3d9deb5b944155303648c6ed8bb65a2c0e9eb8f39e5d16f415666411e2139e36aeedcfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sac-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

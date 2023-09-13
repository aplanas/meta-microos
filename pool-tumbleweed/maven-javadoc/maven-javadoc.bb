SUMMARY = "API documentation for maven"
DESCRIPTION = "API documentation for maven."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.2"

RPM_NAME = "maven-javadoc-3.9.2-2.1.noarch.rpm"
RPM_HASH = "d91bab3e172f454b2eb8148cc54028f854e8cdb03328af594ef83f274b41b6136b3c640fb0ecc9e2d0f301c4d15fccfb038f03e0080683e0cc019b6b4069ebd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

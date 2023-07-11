SUMMARY = "API documentation for maven-dependency-analyzer"
DESCRIPTION = "API documentation for maven-dependency-analyzer"
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-javadoc-1.10-3.13.noarch.rpm"
RPM_HASH = "f46ee4a91dbf739ba9d97282527ffc8f8426964abff35e4365fb546cc4169e0bd2137e039bb5be5af6672790c2aa541c767022eec14b370d733dc85050aceefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

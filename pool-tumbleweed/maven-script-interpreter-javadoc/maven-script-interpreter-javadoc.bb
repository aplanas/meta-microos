SUMMARY = "Javadoc for maven-script-interpreter"
DESCRIPTION = "API documentation for maven-script-interpreter."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "maven-script-interpreter-javadoc-1.3-1.4.noarch.rpm"
RPM_HASH = "f97a6526bf3abb55d528a6a5ccf708a1018eb2c4a52a79c2b27c5c2f79c22b921058540c969e62cce1a757e02d328d309281fafb2ccec5327b82d7fd6b1ff959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

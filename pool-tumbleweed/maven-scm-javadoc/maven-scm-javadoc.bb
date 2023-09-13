SUMMARY = "Javadoc for maven-scm"
DESCRIPTION = "Javadoc for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-javadoc-1.12.0-4.1.noarch.rpm"
RPM_HASH = "455abc9fbdc6f987c1542821dfd4dbd0002f5eb0b2d44d45eb04d77ee52284596b32c728a68fb8283b34408c4f91cef67644c6badb66bc13f3fd5bd8a7a37351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

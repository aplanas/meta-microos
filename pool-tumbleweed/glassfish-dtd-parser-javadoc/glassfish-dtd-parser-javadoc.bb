SUMMARY = "Javadoc for glassfish-dtd-parser"
DESCRIPTION = "This package contains javadoc for glassfish-dtd-parser."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-javadoc-1.4-4.18.noarch.rpm"
RPM_HASH = "599183a5335d1c41c33f66189f5991b7721c59feb2e4a5b8450a652af22b0dfc12ce9bf9ad0a0f9a532c4f862aed90a074ec429f4e04b0919b0c5ba81d5e5c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

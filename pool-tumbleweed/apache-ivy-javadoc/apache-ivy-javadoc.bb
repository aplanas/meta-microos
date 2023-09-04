SUMMARY = "API Documentation for ivy"
DESCRIPTION = "JavaDoc documentation for apache-ivy"
LICENSE = "Apache-2.0"

PV = "2.5.2"

RPM_NAME = "apache-ivy-javadoc-2.5.2-1.1.noarch.rpm"
RPM_HASH = "e1fc33e1777260f8b127523aad814e937e1d2212afbc5d66ba040bb7a8a95f0a2fba55e0c68607b7d871fcb2a5bacad06cc22b290fbca4727c416a7e642d4447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

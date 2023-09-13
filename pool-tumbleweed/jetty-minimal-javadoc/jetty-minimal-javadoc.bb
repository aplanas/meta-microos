SUMMARY = "Javadoc for jetty-minimal"
DESCRIPTION = "Javadoc for jetty-minimal."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-minimal-javadoc-9.4.51-2.1.noarch.rpm"
RPM_HASH = "bd01a2ef85691d21201428c53dc4bd43cf08c091e7fe4f8ea6289a7e43ee7da9f79fa1c6f3a4ca47b791296f881141b659d7ca25233a38ed03416a6151e5d757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-minimal-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

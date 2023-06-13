SUMMARY = "Javadoc for plexus-compiler"
DESCRIPTION = "API documentation for plexus-compiler."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-javadoc-2.11.1-3.4.noarch.rpm"
RPM_HASH = "7962c19c29b226aa0e90ed34cc296766a10f9fdfa69518a2ee32b5ebf05639952c704ec717dfc0d64b23f7148f300413d5b31e23bb5341c4b4a3940e67921438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-compiler-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

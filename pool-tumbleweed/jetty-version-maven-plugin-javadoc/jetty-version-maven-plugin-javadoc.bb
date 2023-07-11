SUMMARY = "API documentation for jetty-version-maven-plugin"
DESCRIPTION = "API documentation for jetty-version-maven-plugin."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-javadoc-1.0.10-2.10.noarch.rpm"
RPM_HASH = "e2a58d7bc563a53816fd5f6fac4fb7eeeeb30d98bf9ee9f1f363808192e686315fec855c05921cd4b1f1d8d270eb4a6083b4ca0de35bc151a6c3555093334859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

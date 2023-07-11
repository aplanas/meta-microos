SUMMARY = "Javadoc for apache-commons-collections"
DESCRIPTION = "Javadoc for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-javadoc-3.2.2-7.5.noarch.rpm"
RPM_HASH = "35463f1a19709022d9b4de9ced8e87a047cb524c043b546241359804e90794baeff7d7252319baef9d254760d253e1e816158efcbf26475a68d3a1f5289e1e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-javadoc \
apache-commons-collections-testframework-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

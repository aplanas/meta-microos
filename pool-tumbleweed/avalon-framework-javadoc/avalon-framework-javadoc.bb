SUMMARY = "Javadoc for avalon-framework"
DESCRIPTION = "API documentation for avalon-framework."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-javadoc-4.3-4.7.noarch.rpm"
RPM_HASH = "a8e42a51c329a708264e4e68b9ceb5e03d7b0f76386643d79e86b320840123d1b9966fa598bc8793e312f7c6c11fc9a55936af711989d7142de4ed88be28cee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework-javadoc \
avalon-framework-manual"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

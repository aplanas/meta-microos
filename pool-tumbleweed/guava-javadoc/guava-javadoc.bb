SUMMARY = "Javadoc for guava"
DESCRIPTION = "API documentation for guava."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "32.0.1"

RPM_NAME = "guava-javadoc-32.0.1-1.1.noarch.rpm"
RPM_HASH = "86750efe2700ff023249ef174c6e6b4c637ee952625991dd6861c9cbb3aa63d05de707e7305ac4f8df703c2e7fe18dd555fc64532133644e15ed4aad7c11d91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

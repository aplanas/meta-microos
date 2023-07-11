SUMMARY = "Javadoc for maven-enforcer"
DESCRIPTION = "API documentation for maven-enforcer."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-javadoc-1.4.1-3.11.noarch.rpm"
RPM_HASH = "fae6be6895b35fb150337e799e6d91c46126b9cb6f9bbb5ccc86ed2310c0e842da35418630bc38aad4fbfc4db5b96291903eeda2c0a810d3a380dd3d1a44d7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

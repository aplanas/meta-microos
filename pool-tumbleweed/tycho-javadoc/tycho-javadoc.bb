SUMMARY = "Javadocs for tycho"
DESCRIPTION = "This package contains the API documentation for tycho."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.6.0"

RPM_NAME = "tycho-javadoc-1.6.0-8.1.noarch.rpm"
RPM_HASH = "66bc04d4e1fd296e7b82b93fd3555709f7ea5c7cdecff45a864394092a2bcf237221873f79a72cc33083d2d6e0e1e228e577e2732ca32fcf32d7402cbbbbe983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tycho-extras-javadoc \
tycho-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

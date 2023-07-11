SUMMARY = "API documentation for maven-resolver"
DESCRIPTION = "This package provides API documentation for maven-resolver."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-javadoc-1.9.12-1.1.noarch.rpm"
RPM_HASH = "1b8d21bbd91bbb4944d4f375e9e21d7ba2ad117c33627d294a31ca90d9d2f3db7355a1280b279eb28faf59c3ba1c71a47c23af9781ddddfd5762d8c0b94714a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

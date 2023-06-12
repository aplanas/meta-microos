SUMMARY = "API documentation for rhino"
DESCRIPTION = "API documentation for rhino."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-javadoc-1.7.14-2.4.noarch.rpm"
RPM_HASH = "f5c87c54adfc9a0f93b7933d116e88d516a22324c634624b05a9dd4c6fef0b5920b43e55cd5ffa172eb3c7df571108fc136a3cd01f304da3e7a24741b6444402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for ant-contrib"
DESCRIPTION = "Api documentation for ant-contrib."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-javadoc-1.0b3-10.5.noarch.rpm"
RPM_HASH = "a291d620a9261d4f9295e51cde14472f1556054dadb7ac011279a68492acd57e697513dd4cd3a439367d3b5cbe579edbd4e173a8996ebbd04ef5ee589df9b88c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm

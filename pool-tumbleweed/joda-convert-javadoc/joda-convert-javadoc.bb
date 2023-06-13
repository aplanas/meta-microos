SUMMARY = "API documentation for joda-convert"
DESCRIPTION = "This package contains the API documentation for joda-convert."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "joda-convert-javadoc-1.9.2-3.6.noarch.rpm"
RPM_HASH = "965213b0199e38c3033ba0a83b9469407e67793679e39a2d9d6debcbe67f01bff8df29049c7972debde87e81b0419b4b4b39841fed1bcbb0a73b541fd8b1036c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

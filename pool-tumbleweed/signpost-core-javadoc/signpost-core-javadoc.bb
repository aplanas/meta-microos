SUMMARY = "Javadoc for signpost-core"
DESCRIPTION = "This package contains the API documentation for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-javadoc-1.2.1.2-3.10.noarch.rpm"
RPM_HASH = "6bbeb45b62bff3752b67102e199bec79b2119228bfe136349a9abe83d70835c4c21a4e13c3cf198cf81287f4699d73fcbe3958360238b1b20a7cefa05839d391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signpost-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for jackson-dataformat-xml"
DESCRIPTION = "This package contains API documentation for jackson-dataformat-xml."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-xml-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "e1f7953bbd0d44f67444e083cb6e77495ae86c7c5a2e5fdb605d2478d3f9ccb50888f7a72059f2d0560524cfda0cde9d6bb85f277b913a41bb1a22c1d0b94b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for maven-plugin-tools"
DESCRIPTION = "API documentation for maven-plugin-tools."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-javadoc-3.6.0-6.1.noarch.rpm"
RPM_HASH = "5db050c0ef90293b176cc3a5e562906272a99b5a596548833b00b1432ef3408e8ab42caab272d3154a3bcf5aa2f5e6ba92106c22ff4c666229ef816d661fc930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-javadoc \
maven-plugin-tools-javadocs"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

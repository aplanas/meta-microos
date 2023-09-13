SUMMARY = "Javadoc for jackson-dataformat-xml"
DESCRIPTION = "This package contains API documentation for jackson-dataformat-xml."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-xml-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "eb4448181076791a0114c8b100d6a1ef144c1f5c900fee2e355f8d7afd43c021f226c9175a5a7e75a932a18f93664f41c1fc0c1a9effedd135f0f3b45a2d5cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

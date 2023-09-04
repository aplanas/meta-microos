SUMMARY = "Core annotations for Jackson data processor"
DESCRIPTION = "Core annotations used for value types, \
used by Jackson data-binding package."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-annotations-2.15.2-1.1.noarch.rpm"
RPM_HASH = "33c0035087c19ef25ad6612a6a8538aca5b583ad90e1f63cfcc4c8b8091231e78cd676d34b4064e939148fe59582e69bc10e655d39ec88b725bbf0c05cd18010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations-pom- \
osgi-com.fasterxml.jackson.core.jackson-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

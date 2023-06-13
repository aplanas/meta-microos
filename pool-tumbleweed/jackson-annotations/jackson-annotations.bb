SUMMARY = "Core annotations for Jackson data processor"
DESCRIPTION = "Core annotations used for value types, \
used by Jackson data-binding package."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-annotations-2.13.3-1.3.noarch.rpm"
RPM_HASH = "d793ed5a7ac20ff4975c0ce47be7b97b0bb64b977df2f60e8f07bae4a8c6e914d1be959acd5f5e57e3b2c3a8731ce6af00527b16fc50d5ec3905dad8dd9783ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations \
mvn(com.fasterxml.jackson.core:jackson-annotations) \
mvn(com.fasterxml.jackson.core:jackson-annotations:pom:) \
osgi(com.fasterxml.jackson.core.jackson-annotations)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

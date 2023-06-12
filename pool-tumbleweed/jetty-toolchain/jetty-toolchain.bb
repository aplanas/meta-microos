SUMMARY = "Jetty Toolchain main POM file"
DESCRIPTION = "Jetty Toolchain main POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.7"

RPM_NAME = "jetty-toolchain-1.7-1.20.noarch.rpm"
RPM_HASH = "2e708b2aeba89199460f90dd36029640ecbeb91f79c7e92008a7168866048b5c4cfa4e64fafa4c0bbe6c61019bf0a238cea611d0b5aefbe393940f78c815d37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-toolchain \
mvn(org.eclipse.jetty.toolchain:jetty-toolchain:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

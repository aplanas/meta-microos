SUMMARY = "Parent POM for xstream"
DESCRIPTION = "Parent POM for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-parent-1.4.20-3.1.noarch.rpm"
RPM_HASH = "fa96dd472668f90df8b7744416524cfddcb2764005ffd23fb63ebb5a2c6a6f9ff3e03d47e85a835369cf39c4c99b1d67154a508247d48e535a967050c9158bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-parent-pom- \
xstream-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
xstream"

inherit rpm

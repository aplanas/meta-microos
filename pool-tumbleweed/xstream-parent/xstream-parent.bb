SUMMARY = "Parent POM for xstream"
DESCRIPTION = "Parent POM for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-parent-1.4.20-1.4.noarch.rpm"
RPM_HASH = "e28b0ae31ee1b7b293632815a0abe9050c1906cb4b4abf29e9e90fb813406b948f93d5e7b1f7b26776d2045c7fd4543307da7241bcf019d972943468906c0e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-parent-pom- \
xstream-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
xstream"

inherit rpm

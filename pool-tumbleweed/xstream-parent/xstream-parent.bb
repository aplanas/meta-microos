SUMMARY = "Parent POM for xstream"
DESCRIPTION = "Parent POM for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-parent-1.4.20-1.3.noarch.rpm"
RPM_HASH = "2a7b9a7dc5a3e3a876a6fe5aae6edc383c2b2d9f110a1d01e7683e7c2286fa0a0ad836e394d2b14220b6948c3de5124995b27230a590dd99133fd5b57af21489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.xstream:xstream-parent:pom:) \
xstream-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.mojo:build-helper-maven-plugin) \
xstream"

inherit rpm

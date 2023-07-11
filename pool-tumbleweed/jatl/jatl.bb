SUMMARY = "Java Anti-Template Language"
DESCRIPTION = "Is an extremely lightweight efficient Java library to \
generate XHTML or XML in a micro DSL builder/fluent style."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-0.2.2-3.11.noarch.rpm"
RPM_HASH = "bba3c55a9143a29577c2ab2f09018ea8c65784de73c5c7ffb627b1c5d00a7848217b02287c4a716648f2bdac963c651b58125de74a052cd5dc9ff39eec3fc9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl \
mvn-com.googlecode.jatl-jatl \
mvn-com.googlecode.jatl-jatl-pom- \
osgi-com.googlecode.jatl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang"

inherit rpm

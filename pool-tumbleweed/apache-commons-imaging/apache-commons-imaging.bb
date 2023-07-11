SUMMARY = "Apache Commons Imaging"
DESCRIPTION = "Apache Commons Imaging (previously Sanselan) is a pure-Java image library."
LICENSE = "Apache-2.0"

PV = "1.0~alpha2"

RPM_NAME = "apache-commons-imaging-1.0~alpha2-2.10.noarch.rpm"
RPM_HASH = "60305cb48478a664321372e38a2d15729bd6bbe53bb9cba55988f017f506c466d13aaae99fd2a980b8dea0b693c4ded1141a5ff0e737ab07fd6b24ee72d11ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging \
mvn-org.apache.commons-commons-imaging \
mvn-org.apache.commons-commons-imaging-pom- \
osgi-org.apache.commons.commons-imaging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

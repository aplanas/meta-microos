SUMMARY = "Mojo Executor"
DESCRIPTION = "The Mojo Executor provides a way to to execute other Mojos (plugins) within a Maven plugin, \
allowing to create Maven plugins that are composed of other plugins."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-2.4.0-1.4.noarch.rpm"
RPM_HASH = "4edee51b223ee79a9e840ea8548fefca99dd074da4f3b929b53c69c927c7cb5ea822454251f93365f37c13f2ac9c49a91181ba421f97b3f736c8ba1255aa3fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor \
mvn-org.twdata.maven-mojo-executor \
mvn-org.twdata.maven-mojo-executor-parent-pom- \
mvn-org.twdata.maven-mojo-executor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm

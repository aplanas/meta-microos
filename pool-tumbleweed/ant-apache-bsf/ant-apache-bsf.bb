SUMMARY = "Optional apache bsf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bsf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-bsf-1.10.13-2.1.noarch.rpm"
RPM_HASH = "81e08654c762549c6659f8e9a5ce81598359d4409eba1b7cda14aae65e4d3fa0b7c17e088092e2a0b36eeee1713143c2b0130f545203387bfa6d3e8483cdca3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bsf \
config-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf-pom-"

RDEPENDS:${PN} += "ant \
bsf \
java-headless \
javapackages-filesystem \
mvn-bsf-bsf \
mvn-org.apache.ant-ant"

inherit rpm

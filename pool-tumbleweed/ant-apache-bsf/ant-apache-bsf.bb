SUMMARY = "Optional apache bsf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bsf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-bsf-1.10.14-1.1.noarch.rpm"
RPM_HASH = "2dce78db4729907508d893476f36e4ea4d96ac2ef0d7ddb61b5942580c696671981b57501cc5a48cf7f2a03a1bd2e130270a09c8f4b91cd23df78496fcfc61e4"
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

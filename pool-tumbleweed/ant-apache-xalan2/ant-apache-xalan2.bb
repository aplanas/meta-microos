SUMMARY = "Optional apache xalan2 tasks for ant"
DESCRIPTION = "Optional apache xalan2 tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-xalan2-1.10.13-2.2.noarch.rpm"
RPM_HASH = "a14d325dc4e6c451dae2362456b54320b0d8bf558a413a416ae1a5123acc8cb3108c8879ec2e9cfba0a0ea04d7d472d832ad140e105f7014e5104e6406886949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-xalan2 \
config-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xalan-xalan \
regexp"

inherit rpm

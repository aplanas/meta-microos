SUMMARY = "Optional apache xalan2 tasks for ant"
DESCRIPTION = "Optional apache xalan2 tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-xalan2-1.10.14-1.1.noarch.rpm"
RPM_HASH = "d875f4530e5bb80a3c97b423e5ab9cd6c1d82bd6a33b30bcb402cc3dfa7dcef23f6cc5b777704554fb51721ca8df5e377e241ea974fc58dabdb80c36abd1a4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-xalan2 \
config-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xalan-serializer \
mvn-xalan-xalan \
regexp"

inherit rpm

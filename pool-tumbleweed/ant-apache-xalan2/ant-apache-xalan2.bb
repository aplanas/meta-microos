SUMMARY = "Optional apache xalan2 tasks for ant"
DESCRIPTION = "Optional apache xalan2 tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-xalan2-1.10.13-2.1.noarch.rpm"
RPM_HASH = "fa2f349eda4ce2300a863abcd98f97eab0bda542f6932b04f9bfc4741ff102dd8dafe35bce9a0eaf3a56c7518332c67d2e1bb592275767f2e20828baa13ebc3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-xalan2 \
config(ant-apache-xalan2) \
mvn(org.apache.ant:ant-apache-xalan2) \
mvn(org.apache.ant:ant-apache-xalan2:pom:)"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(xalan:xalan) \
regexp"

inherit rpm

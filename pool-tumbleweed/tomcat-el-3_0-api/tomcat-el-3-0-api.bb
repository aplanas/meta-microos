SUMMARY = "Expression Language v3.0 API"
DESCRIPTION = "Expression Language API version 3.0."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-el-3_0-api-9.0.75-1.2.noarch.rpm"
RPM_HASH = "b4dc94d01aecaab2e85b0232e95bd825bee4293d5094103c0384824d709d282db7987f5a161c980645b9b7d3cebba13a5c5634699253ef0e69c4ace2e86e3e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el-3-0-api \
el-api \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-el-api-pom- \
mvn-org.eclipse.jetty.orbit-javax.el \
mvn-org.eclipse.jetty.orbit-javax.el-pom- \
osgi-org.apache.tomcat-el-api \
tomcat-el-3-0-api \
tomcat-el-3.0-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm

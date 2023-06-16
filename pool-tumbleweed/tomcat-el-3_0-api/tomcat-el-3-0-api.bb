SUMMARY = "Expression Language v3.0 API"
DESCRIPTION = "Expression Language API version 3.0."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-el-3_0-api-9.0.75-1.1.noarch.rpm"
RPM_HASH = "0283fbde80d277a80f8161d41e5f02bd7f4f850f7fe708bc23abae0ac2f9bb776f5a4db9eddfdb3186a9b6e9c2f7e8313f3384244a0a23fcbdbdc6fef17e1bca"
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

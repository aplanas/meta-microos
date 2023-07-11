SUMMARY = "Libraries needed to run the Tomcat Web container"
DESCRIPTION = "Libraries required to successfully run the Tomcat Web container"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-lib-9.0.75-1.2.noarch.rpm"
RPM_HASH = "224a40d26ed926b8248c142a316a391eddb2343aa86f2628b6b92e5e1f9dec13f24469a965646185c8474a307e687125dc5fa0b7f60b378557fa40a7d3b06a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-lib \
jakarta-commons-dbcp-tomcat5 \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.apache.tomcat-tomcat-annotations-api-pom- \
mvn-org.apache.tomcat-tomcat-api \
mvn-org.apache.tomcat-tomcat-api-pom- \
mvn-org.apache.tomcat-tomcat-catalina \
mvn-org.apache.tomcat-tomcat-catalina-ha \
mvn-org.apache.tomcat-tomcat-catalina-ha-pom- \
mvn-org.apache.tomcat-tomcat-catalina-pom- \
mvn-org.apache.tomcat-tomcat-coyote \
mvn-org.apache.tomcat-tomcat-coyote-pom- \
mvn-org.apache.tomcat-tomcat-dbcp \
mvn-org.apache.tomcat-tomcat-dbcp-pom- \
mvn-org.apache.tomcat-tomcat-jasper \
mvn-org.apache.tomcat-tomcat-jasper-el \
mvn-org.apache.tomcat-tomcat-jasper-el-pom- \
mvn-org.apache.tomcat-tomcat-jasper-pom- \
mvn-org.apache.tomcat-tomcat-jaspic-api \
mvn-org.apache.tomcat-tomcat-jaspic-api-pom- \
mvn-org.apache.tomcat-tomcat-jdbc \
mvn-org.apache.tomcat-tomcat-jdbc-pom- \
mvn-org.apache.tomcat-tomcat-jni \
mvn-org.apache.tomcat-tomcat-jni-pom- \
mvn-org.apache.tomcat-tomcat-juli \
mvn-org.apache.tomcat-tomcat-juli-pom- \
mvn-org.apache.tomcat-tomcat-tribes \
mvn-org.apache.tomcat-tomcat-tribes-pom- \
mvn-org.apache.tomcat-tomcat-util \
mvn-org.apache.tomcat-tomcat-util-pom- \
mvn-org.apache.tomcat-tomcat-util-scan \
mvn-org.apache.tomcat-tomcat-util-scan-pom- \
mvn-org.apache.tomcat-tomcat-websocket \
mvn-org.apache.tomcat-tomcat-websocket-api \
mvn-org.apache.tomcat-tomcat-websocket-api-pom- \
mvn-org.apache.tomcat-tomcat-websocket-pom- \
osgi-org.apache.tomcat-annotations-api \
osgi-org.apache.tomcat-api \
osgi-org.apache.tomcat-catalina \
osgi-org.apache.tomcat-catalina-ha \
osgi-org.apache.tomcat-coyote \
osgi-org.apache.tomcat-dbcp \
osgi-org.apache.tomcat-jasper \
osgi-org.apache.tomcat-jasper-el \
osgi-org.apache.tomcat-jaspic-api \
osgi-org.apache.tomcat-jni \
osgi-org.apache.tomcat-juli \
osgi-org.apache.tomcat-ssi \
osgi-org.apache.tomcat-storeconfig \
osgi-org.apache.tomcat-tribes \
osgi-org.apache.tomcat-util \
osgi-org.apache.tomcat-util-scan \
osgi-org.apache.tomcat-websocket \
osgi-org.apache.tomcat-websocket-api \
osgi-org.apache.tomcat.jdbc \
osgi-org.eclipse.jdt.core.compiler.batch \
tomcat-lib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ecj \
java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.eclipse.jdt-ecj \
tomcat-el-3.0-api \
tomcat-jsp-2.3-api \
tomcat-servlet-4.0-api"

inherit rpm

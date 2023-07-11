SUMMARY = "Apache implementation of the SOAP"
DESCRIPTION = "Apache Axis is an implementation of the SOAP ('Simple Object Access \
Protocol') submission to W3C."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-1.4-306.7.noarch.rpm"
RPM_HASH = "f8113978bc65c433a18b20a97d31e1263e16e909ef4b2c3a449a8450c18383afe1d934fe1554c53cb37d47ef56f672da1ecf32348e473ba9cb855f4a49e133ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis \
mvn-axis-axis \
mvn-axis-axis-ant \
mvn-axis-axis-ant-pom- \
mvn-axis-axis-jaxrpc \
mvn-axis-axis-jaxrpc-pom- \
mvn-axis-axis-pom- \
mvn-axis-axis-saaj \
mvn-axis-axis-saaj-pom- \
mvn-org.apache.axis-axis-ant \
mvn-org.apache.axis-axis-ant-pom- \
mvn-org.apache.axis-axis-jaxrpc \
mvn-org.apache.axis-axis-jaxrpc-pom- \
mvn-org.apache.axis-axis-saaj \
mvn-org.apache.axis-axis-saaj-pom- \
osgi-javax.xml.rpc \
osgi-javax.xml.soap \
osgi-org.apache.axis"

RDEPENDS:${PN} += "apache-commons-httpclient \
apache-commons-logging \
glassfish-activation-api \
jakarta-commons-discovery \
java \
java-headless \
javamail \
javapackages-filesystem \
jaxp-parser-impl \
mvn-axis-axis-wsdl4j \
mvn-commons-discovery-commons-discovery \
mvn-commons-logging-commons-logging \
osgi-javax.wsdl \
osgi-org.apache.commons.discovery \
reload4j \
wsdl4j"

inherit rpm

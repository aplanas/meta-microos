SUMMARY = "HTTP agent implementation based on httpcomponents HttpCore"
DESCRIPTION = "HttpClient is a HTTP/1.1 compliant HTTP agent implementation based on \
httpcomponents HttpCore. It also provides reusable components for \
client-side authentication, HTTP state management, and HTTP connection \
management. HttpComponents Client is a successor of and replacement \
for Commons HttpClient 3.x. Users of Commons HttpClient are strongly \
encouraged to upgrade."
LICENSE = "Apache-2.0"

PV = "4.5.12"

RPM_NAME = "httpcomponents-client-4.5.12-2.7.noarch.rpm"
RPM_HASH = "de7639b2a6dfde0263f62984eec34452d221053a43ef927775d273cfdd7ddf05eed878dc3b5ee4e43ad1ff07eb9d2548c281fc538dc08c283e288f1e6ed37755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client \
mvn-org.apache.httpcomponents-fluent-hc \
mvn-org.apache.httpcomponents-fluent-hc-pom- \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpclient-pom- \
mvn-org.apache.httpcomponents-httpmime \
mvn-org.apache.httpcomponents-httpmime-pom- \
osgi-org.apache.httpcomponents.fluent-hc \
osgi-org.apache.httpcomponents.httpclient \
osgi-org.apache.httpcomponents.httpmime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpcore \
publicsuffix"

inherit rpm

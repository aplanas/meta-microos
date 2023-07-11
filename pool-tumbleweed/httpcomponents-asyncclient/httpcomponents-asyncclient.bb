SUMMARY = "Apache components to build asynchronous client side HTTP services"
DESCRIPTION = "Asynch HttpClient is a HTTP/1.1 compliant HTTP agent implementation based on \
HttpCore NIO and HttpClient components. It is a complementary module to \
Apache HttpClient intended for special cases where ability to handle \
a great number of concurrent connections is more important than performance \
in terms of a raw data throughput."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-4.1.4-3.10.noarch.rpm"
RPM_HASH = "9be891e611cf50e0ced6d72bd3edc494cd59bf95740ffc181165a6f868fd5ecf3a760fb1fbefe2c05f369b18055cf9e2d296f0b1dba0dec85cb0e2e1696e60ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient \
mvn-org.apache.httpcomponents-httpasyncclient \
mvn-org.apache.httpcomponents-httpasyncclient-pom- \
osgi-org.apache.httpcomponents.httpasyncclient"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.httpcomponents-httpcore-nio"

inherit rpm

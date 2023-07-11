SUMMARY = "Set of low level Java HTTP transport components for HTTP services"
DESCRIPTION = "HttpCore is a set of low level HTTP transport components that can be \
used to build custom client and server side HTTP services with a \
minimal footprint. HttpCore supports two I/O models: blocking I/O \
model based on the classic Java I/O and non-blocking, event driven I/O \
model based on Java NIO. \
 \
The blocking I/O model may be more appropriate for data intensive, low \
latency scenarios, whereas the non-blocking model may be more \
appropriate for high latency scenarios where raw data throughput is \
less important than the ability to handle thousands of simultaneous \
HTTP connections in a resource efficient manner."
LICENSE = "Apache-2.0"

PV = "4.4.13"

RPM_NAME = "httpcomponents-core-4.4.13-2.7.noarch.rpm"
RPM_HASH = "2d66a31fd033b3bf285dc6be6c1def9122d51d017e80da989beedad0a238b33e3f86f71381b920b90d7442a1ce005cad142639c53734a9d174389281ffc5356f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-core \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.httpcomponents-httpcore-nio \
mvn-org.apache.httpcomponents-httpcore-nio-pom- \
mvn-org.apache.httpcomponents-httpcore-pom- \
osgi-org.apache.httpcomponents.httpcore \
osgi-org.apache.httpcomponents.httpcore-nio"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

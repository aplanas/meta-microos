SUMMARY = "Apache Log4j NoSql"
DESCRIPTION = "Use NoSQL databases such as MongoDB and CouchDB to append log messages."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-nosql-2.17.2-5.8.noarch.rpm"
RPM_HASH = "87163338b9fd0f3877bf35a290a11f7563b667ccaf51ed3a8f522e69c1bee975391cc0528c80c60527bc9940f74f8b8863878b7dfe3a03b2b5747b6302910aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-nosql \
mvn-org.apache.logging.log4j-log4j-couchdb \
mvn-org.apache.logging.log4j-log4j-couchdb-pom- \
osgi-org.apache.logging.log4j.couchdb"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.lightcouch-lightcouch"

inherit rpm

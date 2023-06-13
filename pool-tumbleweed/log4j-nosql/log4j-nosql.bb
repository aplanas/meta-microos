SUMMARY = "Apache Log4j NoSql"
DESCRIPTION = "Use NoSQL databases such as MongoDB and CouchDB to append log messages."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-nosql-2.17.2-5.7.noarch.rpm"
RPM_HASH = "4bffc9feb4943e4b9b171ab41adcb8950a3a92733ee16e38a3ba9fcba765094daa1dd3cc470319229ac4508f4067168ecc0417e8d641254d0798d7a7e5384fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-nosql \
mvn(org.apache.logging.log4j:log4j-couchdb) \
mvn(org.apache.logging.log4j:log4j-couchdb:pom:) \
osgi(org.apache.logging.log4j.couchdb)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.logging.log4j:log4j-core) \
mvn(org.lightcouch:lightcouch)"

inherit rpm

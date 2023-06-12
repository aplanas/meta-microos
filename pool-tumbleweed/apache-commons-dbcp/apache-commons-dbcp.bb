SUMMARY = "Jakarta Commons DataBase Pooling Package"
DESCRIPTION = "The DBCP package creates and maintains a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package is available as a pseudo-JDBC driver and via a \
DataSource interface. The package also supports multiple logins to \
multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-dbcp-2.1.1-6.16.noarch.rpm"
RPM_HASH = "81d264c9c8caa0d369a1543171bd7f49739d9a0317f5aa7ae5bbc2d993f165f1e80bdafdf439b282a791c7bbaa7e3db1a18af5d6aef7caffc618717d2ff11e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp \
commons-dbcp2 \
hibernate_jdbc_cache \
jakarta-commons-dbcp2 \
mvn(org.apache.commons:commons-dbcp2) \
mvn(org.apache.commons:commons-dbcp2:pom:)"
RDEPENDS:${PN} += "/bin/sh \
commons-collections \
commons-pool2 \
java-headless \
javapackages-filesystem \
jta_api \
mvn(commons-logging:commons-logging) \
mvn(org.apache.commons:commons-pool2) \
update-alternatives"

inherit rpm

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

RPM_NAME = "apache-commons-dbcp-2.1.1-6.17.noarch.rpm"
RPM_HASH = "c317399efb00add5d7f4562cbef3efe093eda6682b9af866b24ac906a6b4130086bde721d774f2cefd9fb435580190df95de0d9830102d07bc7752ca4f227a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp \
commons-dbcp2 \
hibernate-jdbc-cache \
jakarta-commons-dbcp2 \
mvn-org.apache.commons-commons-dbcp2 \
mvn-org.apache.commons-commons-dbcp2-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
commons-collections \
commons-pool2 \
java-headless \
javapackages-filesystem \
jta-api \
mvn-commons-logging-commons-logging \
mvn-org.apache.commons-commons-pool2 \
update-alternatives"

inherit rpm

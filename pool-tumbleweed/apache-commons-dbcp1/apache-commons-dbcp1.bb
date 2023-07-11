SUMMARY = "Jakarta Commons DataBase Pooling Package"
DESCRIPTION = "The DBCP package creates and maintains a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package is available as a pseudo-JDBC driver and via a \
DataSource interface. The package also supports multiple logins to \
multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "apache-commons-dbcp1-1.4-3.17.noarch.rpm"
RPM_HASH = "dc08c7198bb8775d00deb6ba8cc2d212df7f0c9abe6af6e13b9014796aa576f626ec80f554d577d93766d5cf14427f190c0e1093e0546fe41325b880356c1493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1 \
commons-dbcp \
jakarta-commons-dbcp \
mvn-commons-dbcp-commons-dbcp \
mvn-commons-dbcp-commons-dbcp-pom-"

RDEPENDS:${PN} += "commons-collections \
commons-pool \
java-headless \
javapackages-filesystem \
jta-api \
mvn-commons-pool-commons-pool \
update-alternatives"

inherit rpm

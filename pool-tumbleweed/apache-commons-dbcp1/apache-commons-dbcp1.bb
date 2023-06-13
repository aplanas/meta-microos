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

RPM_NAME = "apache-commons-dbcp1-1.4-3.16.noarch.rpm"
RPM_HASH = "d1cbfc7dfcee6a376354ac909f931fc6fe1963972cd6b7d1c12d803390e58af0732a9d41a985455cc184f707d5cab6fd84ee9c1f630ae26a13859468ff4f970e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1 \
commons-dbcp \
jakarta-commons-dbcp \
mvn(commons-dbcp:commons-dbcp) \
mvn(commons-dbcp:commons-dbcp:pom:)"

RDEPENDS:${PN} += "commons-collections \
commons-pool \
java-headless \
javapackages-filesystem \
jta_api \
mvn(commons-pool:commons-pool) \
update-alternatives"

inherit rpm

SUMMARY = "Javadoc for apache-commons-dbcp"
DESCRIPTION = "This package contains the javadoc documentation for the DBCP package. \
 \
The DBCP package shall create and maintain a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package shall be available as a pseudo-JDBC driver and via \
a DataSource interface. The package shall also support multiple logins \
to multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-dbcp-javadoc-2.1.1-6.17.noarch.rpm"
RPM_HASH = "6782465882cf4eeb55ac7db6e82dc05f1ba8b35c8c0f48cc7e330b953ae20ec3299f3748b90924bb5e14c38725239e1eab117b2245c6a9bf1b6192e7bc6d2abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

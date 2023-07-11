SUMMARY = "Javadoc for jakarta-commons-dbcp"
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

PV = "1.4"

RPM_NAME = "apache-commons-dbcp1-javadoc-1.4-3.17.noarch.rpm"
RPM_HASH = "7623b8b14cc59925bf3fd05c54442b62ba864dc798fa5647cb9b84cc52c903fdf90a655fed15e9da0ffa570a97d2461eca5bfb3fcea58c7f0b0b1e25e6a8bdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

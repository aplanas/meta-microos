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

RPM_NAME = "apache-commons-dbcp1-javadoc-1.4-3.16.noarch.rpm"
RPM_HASH = "94f974e87626d65fdcd2072c8ad58c97211585afb14ee2d7a9dd139bcfae80ddb90a19c7d7f7f5303940a84e0e0d477bf676dfbc12bff2a07bec7148afd4f491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

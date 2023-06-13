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

RPM_NAME = "apache-commons-dbcp-javadoc-2.1.1-6.16.noarch.rpm"
RPM_HASH = "58c71fec24f86ebce33f066e27fc538e803155eba9a82b16e98752fbf7616269effa58abb820f4da8fd3a8e4c5b64c0da9d3cb6c1cdef29f3117a0b2cc4f6b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "SQLite JDBC Driver"
DESCRIPTION = "SQLite JDBC is a library for accessing and creating SQLite database files in \
Java. \
 \
Our SQLiteJDBC library requires no configuration since native libraries for \
major OSs, including Windows, Mac OS X, Linux etc., are assembled into a single \
JAR (Java Archive) file. The usage is quite simple; download our sqlite-jdbc \
library, then append the library (JAR file) to your class path."
LICENSE = "Apache-2.0"

PV = "3.43.0.0"

RPM_NAME = "sqlite-jdbc-3.43.0.0-1.1.aarch64.rpm"
RPM_HASH = "d06c4594a2ae8702c85505a72680cd9fb5c240841371c1782f6e6b27967a9d72cf54da8c9f2bd186b75a11f53be71f137f868e414a3c5c84a30b784b6b57e7f6"

RPROVIDES:${PN} += "mvn-org.xerial-sqlite-jdbc \
mvn-org.xerial-sqlite-jdbc-pom- \
osgi-org.xerial.sqlite-jdbc \
sqlite-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

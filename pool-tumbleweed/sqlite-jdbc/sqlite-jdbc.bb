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

RPM_NAME = "sqlite-jdbc-3.43.0.0-2.1.aarch64.rpm"
RPM_HASH = "329a66fba3e7bccfc3d4ac7b4e62f51a0dfd4217abb49aa0b34f5b19f8096fa07b1353aac1c056ef5b28b3b70a6db18be2be18f5bfbf50c3248cb6deaf7b8a6b"

RPROVIDES:${PN} += "mvn-org.xerial-sqlite-jdbc \
mvn-org.xerial-sqlite-jdbc-pom- \
osgi-org.xerial.sqlite-jdbc \
sqlite-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

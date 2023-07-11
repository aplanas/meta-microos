SUMMARY = "SQLite JDBC Driver"
DESCRIPTION = "SQLite JDBC is a library for accessing and creating SQLite database files in \
Java. \
 \
Our SQLiteJDBC library requires no configuration since native libraries for \
major OSs, including Windows, Mac OS X, Linux etc., are assembled into a single \
JAR (Java Archive) file. The usage is quite simple; download our sqlite-jdbc \
library, then append the library (JAR file) to your class path."
LICENSE = "Apache-2.0"

PV = "3.42.0.0"

RPM_NAME = "sqlite-jdbc-3.42.0.0-1.2.aarch64.rpm"
RPM_HASH = "77de00120c70631718bf920210368ce9da5f7e5f5905bed1f10521b1b369e72452f0e1103282abc88fbabafdf6abfaab4d0ff58deae94b21c7303e26d1002539"

RPROVIDES:${PN} += "mvn-org.xerial-sqlite-jdbc \
mvn-org.xerial-sqlite-jdbc-pom- \
osgi-org.xerial.sqlite-jdbc \
sqlite-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

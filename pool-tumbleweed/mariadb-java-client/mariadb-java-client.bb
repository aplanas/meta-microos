SUMMARY = "Connects applications developed in Java to MariaDB and MySQL databases"
DESCRIPTION = "MariaDB Connector/J is a Type 4 JDBC driver, also known as the Direct to \
Database Pure Java Driver. It was developed specifically as a lightweight \
JDBC connector for use with MySQL and MariaDB database servers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-2.4.3-2.1.aarch64.rpm"
RPM_HASH = "dd1ab229d4bb0930d1add5cd3ef4d4d955626e2a9784da065fb73b8e93fed3f4869174abbd5dc91db4b4ce9ce559b14322d7f97100fe9d6ae0792a15e5edd05c"

RPROVIDES:${PN} += "mariadb-java-client \
mvn-mariadb-mariadb-connector-java \
mvn-mariadb-mariadb-connector-java-pom- \
mvn-org.mariadb.jdbc-mariadb-java-client \
mvn-org.mariadb.jdbc-mariadb-java-client-pom- \
osgi-org.mariadb.jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mariadb"

inherit rpm

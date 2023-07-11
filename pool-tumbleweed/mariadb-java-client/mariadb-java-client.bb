SUMMARY = "Connects applications developed in Java to MariaDB and MySQL databases"
DESCRIPTION = "MariaDB Connector/J is a Type 4 JDBC driver, also known as the Direct to \
Database Pure Java Driver. It was developed specifically as a lightweight \
JDBC connector for use with MySQL and MariaDB database servers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-2.4.3-1.19.aarch64.rpm"
RPM_HASH = "3837bce39f69b31e235eb2607c85cb579fb2bb94808bb5a219d6eb8c9d7c366ef0b12d3d57fec7d0d5b77dd21e11fc07b44eb9a1663ca87a08f8a526e4ecd839"

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

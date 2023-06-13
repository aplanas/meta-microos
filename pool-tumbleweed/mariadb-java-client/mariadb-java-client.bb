SUMMARY = "Connects applications developed in Java to MariaDB and MySQL databases"
DESCRIPTION = "MariaDB Connector/J is a Type 4 JDBC driver, also known as the Direct to \
Database Pure Java Driver. It was developed specifically as a lightweight \
JDBC connector for use with MySQL and MariaDB database servers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-2.4.3-1.18.aarch64.rpm"
RPM_HASH = "549e62c123b4b34e9235e0e7172357d4bfd824969f08b06c01eeb01f9f5d7b431891992a73e372c4bedc34f2b8b3824b28f122fa5976300a9641192092c138b0"

RPROVIDES:${PN} += "mariadb-java-client \
mariadb-java-client(aarch-64) \
mvn(mariadb:mariadb-connector-java) \
mvn(mariadb:mariadb-connector-java:pom:) \
mvn(org.mariadb.jdbc:mariadb-java-client) \
mvn(org.mariadb.jdbc:mariadb-java-client:pom:) \
osgi(org.mariadb.jdbc)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mariadb"

inherit rpm

SUMMARY = "JDBC driver for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced Object-Relational database management \
system. The postgresql-jdbc package includes the .jar files needed for \
Java programs to access a PostgreSQL database."
LICENSE = "BSD-2-Clause"

PV = "42.2.25"

RPM_NAME = "postgresql-jdbc-42.2.25-4.4.noarch.rpm"
RPM_HASH = "726c40e8f450fa85d8fa87f11fd23e087f6c203932ffaac7acd43e2d3f08a4098be51e7811a4e0d74aaa3f1e30530e454203bffeba53f071a58d70010c9cc2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.postgresql-postgresql \
mvn-org.postgresql-postgresql-pom- \
mvn-postgresql-postgresql \
mvn-postgresql-postgresql-pom- \
postgresql-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.scram-client"

inherit rpm

SUMMARY = "JDBC driver for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced Object-Relational database management \
system. The postgresql-jdbc package includes the .jar files needed for \
Java programs to access a PostgreSQL database."
LICENSE = "BSD-2-Clause"

PV = "42.2.25"

RPM_NAME = "postgresql-jdbc-42.2.25-4.3.noarch.rpm"
RPM_HASH = "3ad20810d184f9487ad21930a25470d1b0b05dcb1f4505cc6fe67e66220f75cfc25641e266c0e608705ea607419f15fd9f435959a2ce176a13bc13e192e14aa5"
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

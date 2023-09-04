SUMMARY = "Database URIs"
DESCRIPTION = "Database URIs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-URI-db-0.21-1.3.noarch.rpm"
RPM_HASH = "85cb0765d2eac27109a0b5f1f24c94f7b6306d28a1206f9f967c23380d1a2045dbaa001222609995a824fab137db2488ef7c3cb87ebee9a55efd3b4b65561631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI---ado \
perl-URI---db \
perl-URI---odbc \
perl-URI--cassandra \
perl-URI--cockroach \
perl-URI--cockroachdb \
perl-URI--couch \
perl-URI--couchdb \
perl-URI--cubrid \
perl-URI--db \
perl-URI--db2 \
perl-URI--derby \
perl-URI--exasol \
perl-URI--firebird \
perl-URI--hive \
perl-URI--impala \
perl-URI--informix \
perl-URI--ingres \
perl-URI--interbase \
perl-URI--ldapdb \
perl-URI--maria \
perl-URI--mariadb \
perl-URI--max \
perl-URI--maxdb \
perl-URI--monet \
perl-URI--monetdb \
perl-URI--mongo \
perl-URI--mongodb \
perl-URI--mssql \
perl-URI--mysql \
perl-URI--oracle \
perl-URI--pg \
perl-URI--pgsql \
perl-URI--pgxc \
perl-URI--postgres \
perl-URI--postgresql \
perl-URI--postgresxc \
perl-URI--redshift \
perl-URI--snowflake \
perl-URI--sqlite \
perl-URI--sqlite3 \
perl-URI--sqlserver \
perl-URI--sybase \
perl-URI--teradata \
perl-URI--unify \
perl-URI--vertica \
perl-URI--yugabyte \
perl-URI--yugabytedb \
perl-URI-db"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI \
perl-URI--Nested"

inherit rpm

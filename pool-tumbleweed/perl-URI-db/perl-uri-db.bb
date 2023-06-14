SUMMARY = "Database URIs"
DESCRIPTION = "Database URIs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-URI-db-0.21-1.1.noarch.rpm"
RPM_HASH = "2cb6e4b49a5ddfc32402650adb2d92fb642db977c760abc3406ef021e1beaff2b4f9a14d8d088825779ca7caceeb28d46ba93712e1824ea45c605027e2c7b419"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-URI \
perl-URI--Nested"

inherit rpm

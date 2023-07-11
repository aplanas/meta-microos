SUMMARY = "Wrapper around DBD::Pg for using PostgreSql with Mojolicious"
DESCRIPTION = "Mojo::Pg is a tiny wrapper around DBD::Pg that makes at \
http://www.postgresql.org a lot of fun to use with the at \
https://mojolicious.org real-time web framework. Perform queries blocking \
and non-blocking, use all at \
https://www.postgresql.org/docs/current/static/sql.html PostgreSQL has to \
offer, generate CRUD queries from data structures, manage your database \
schema with migrations and build scalable real-time web applications with \
the publish/subscribe pattern."
LICENSE = "Artistic-2.0"

PV = "4.27"

RPM_NAME = "perl-Mojo-Pg-4.27-1.8.noarch.rpm"
RPM_HASH = "a0e7ef5b59bd7fe2c1539bb10333af2dca22412882a61927f0b02dfd2d4b705c8867b302c9e3d32752465865abe0c199c5ecd8facf71e519deca0d2dfbc20c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Pg \
perl-Mojo--Pg--Database \
perl-Mojo--Pg--Migrations \
perl-Mojo--Pg--PubSub \
perl-Mojo--Pg--Results \
perl-Mojo--Pg--Transaction \
perl-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBD--Pg \
perl-Mojolicious \
perl-SQL--Abstract--Pg"

inherit rpm

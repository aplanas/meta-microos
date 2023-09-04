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

RPM_NAME = "perl-Mojo-Pg-4.27-1.9.noarch.rpm"
RPM_HASH = "6094e20ac38350e958ad2e053208632e62065ffdcde97e978eb0ce08a320f73877dd46126fd1018b07721f167e45e30078c22ecf3a5625ad9f48252673a5a864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Pg \
perl-Mojo--Pg--Database \
perl-Mojo--Pg--Migrations \
perl-Mojo--Pg--PubSub \
perl-Mojo--Pg--Results \
perl-Mojo--Pg--Transaction \
perl-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBD--Pg \
perl-Mojolicious \
perl-SQL--Abstract--Pg"

inherit rpm

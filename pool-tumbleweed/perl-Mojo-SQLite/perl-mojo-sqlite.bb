SUMMARY = "Tiny Mojolicious wrapper for SQLite"
DESCRIPTION = "Mojo::SQLite is a tiny wrapper around DBD::SQLite that makes at \
https://www.sqlite.org/ a lot of fun to use with the at https://mojolico.us \
real-time web framework. Use all at http://sqlite.org/lang.html SQLite has \
to offer, generate CRUD queries from data structures, and manage your \
database schema with migrations."
LICENSE = "Artistic-2.0"

PV = "3.009"

RPM_NAME = "perl-Mojo-SQLite-3.009-1.7.noarch.rpm"
RPM_HASH = "8e99d1e9cee1a09b66ea130ae3bb0cce914ce12aa87c61de247aa3a156465d4b0f646be1bb41200b3dc2d24081c1faf4b8736aebf1bb5f8b86cf0bab064e6211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--SQLite \
perl-Mojo--SQLite--Database \
perl-Mojo--SQLite--Migrations \
perl-Mojo--SQLite--PubSub \
perl-Mojo--SQLite--Results \
perl-Mojo--SQLite--Transaction \
perl-Mojo-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DBD--SQLite \
perl-DBI \
perl-Mojolicious \
perl-SQL--Abstract--Pg \
perl-URI \
perl-URI--db \
perl-URI--file"

inherit rpm

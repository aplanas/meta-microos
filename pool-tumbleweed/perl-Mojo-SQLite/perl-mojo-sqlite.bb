SUMMARY = "Tiny Mojolicious wrapper for SQLite"
DESCRIPTION = "Mojo::SQLite is a tiny wrapper around DBD::SQLite that makes at \
https://www.sqlite.org/ a lot of fun to use with the at https://mojolico.us \
real-time web framework. Use all at http://sqlite.org/lang.html SQLite has \
to offer, generate CRUD queries from data structures, and manage your \
database schema with migrations."
LICENSE = "Artistic-2.0"

PV = "3.009"

RPM_NAME = "perl-Mojo-SQLite-3.009-1.8.noarch.rpm"
RPM_HASH = "97f7304477739779d6bc61446a6b646232f1a403238c54e406d6a653afc33be26e045f1c9bdb9df59814e59cdb9fed4852d0735663854928886fac66b6a3de3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--SQLite \
perl-Mojo--SQLite--Database \
perl-Mojo--SQLite--Migrations \
perl-Mojo--SQLite--PubSub \
perl-Mojo--SQLite--Results \
perl-Mojo--SQLite--Transaction \
perl-Mojo-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBD--SQLite \
perl-DBI \
perl-Mojolicious \
perl-SQL--Abstract--Pg \
perl-URI \
perl-URI--db \
perl-URI--file"

inherit rpm

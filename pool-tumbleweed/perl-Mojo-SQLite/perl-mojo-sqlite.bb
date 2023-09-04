SUMMARY = "Tiny Mojolicious wrapper for SQLite"
DESCRIPTION = "Mojo::SQLite is a tiny wrapper around DBD::SQLite that makes at \
https://www.sqlite.org/ a lot of fun to use with the at https://mojolico.us \
real-time web framework. Use all at http://sqlite.org/lang.html SQLite has \
to offer, generate CRUD queries from data structures, and manage your \
database schema with migrations."
LICENSE = "Artistic-2.0"

PV = "3.009"

RPM_NAME = "perl-Mojo-SQLite-3.009-1.9.noarch.rpm"
RPM_HASH = "eaac7ef650bea648a36b9283799bd447bf36a7fa07b73f305a3327e585b986bcc4bc1bb4e9bad565a356c2bdced5542178d75b6568a70e4987f9e77738f45035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--SQLite \
perl-Mojo--SQLite--Database \
perl-Mojo--SQLite--Migrations \
perl-Mojo--SQLite--PubSub \
perl-Mojo--SQLite--Results \
perl-Mojo--SQLite--Transaction \
perl-Mojo-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBD--SQLite \
perl-DBI \
perl-Mojolicious \
perl-SQL--Abstract--Pg \
perl-URI \
perl-URI--db \
perl-URI--file"

inherit rpm

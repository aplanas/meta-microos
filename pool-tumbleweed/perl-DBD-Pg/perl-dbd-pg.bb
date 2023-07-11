SUMMARY = "DBI PostgreSQL interface"
DESCRIPTION = "DBD::Pg is a Perl module that works with the DBI module to provide access \
to PostgreSQL databases."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.16.3"

RPM_NAME = "perl-DBD-Pg-3.16.3-1.3.aarch64.rpm"
RPM_HASH = "7a51ec780778140f27c51d9b2c6ca5e0d9003181122ae18abd8759634935848f4a2a4a0effb4e9458c573ab6e4a123ebca1acdd115608c5bf2419c750b225a9f"

RPROVIDES:${PN} += "perl-Bundle--DBD--Pg \
perl-DBD--Pg \
perl-DBD--Pg--DefaultValue \
perl-DBD--Pg--db \
perl-DBD--Pg--dr \
perl-DBD--Pg--st \
perl-DBD-Pg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
perl--MODULE-COMPAT-5.36.1 \
perl-DBI \
perl-version"

inherit rpm
